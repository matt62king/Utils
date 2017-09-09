package com.shaelabs.utils.generator.client.beangen;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JField;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.core.ext.typeinfo.JParameter;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.rebind.IndentedWriter;
import com.shaelabs.utils.generator.client.BaseGenerator;
import com.shaelabs.utils.generator.client.annotation.Ignore;

/**
 * @author Matt
 * @since
 */
public class BeanGenerator extends BaseGenerator {

	private JClassType beanType;
	private JClassType editorType;
	
	@Override
	protected void doGenerate(JClassType interfaceType, String implName, IndentedWriter writer) {
		writeImports(writer, interfaceType);
		extractBeanAndEditorTypes(interfaceType);
		writeClassIntro(interfaceType, implName, writer);
		writeFields(writer, interfaceType);
		writeInterfaceMethods(writer, interfaceType);
		//writeGettersAndSetters(writer, interfaceType);
		writeOutro(writer);	
	}
	
	private void writeImports(IndentedWriter writer, JClassType interfaceType) {
		writer.newline();
	}
	
	private void extractBeanAndEditorTypes(JClassType interfaceType) {
		JClassType[] nestedType = interfaceType.getImplementedInterfaces()[0].isParameterized().getTypeArgs();
		beanType = nestedType[0];
		editorType = nestedType[1];
	}
	
	private void writeFields(IndentedWriter writer, JClassType interfaceType) {		
		writer.write("private " +  beanType.getQualifiedSourceName() + " bean "+ 
				" = new " + beanType.getQualifiedSourceName() + "();");
		
		writer.write("private " + editorType.getQualifiedSourceName() + " editor;");
	}
	
	private void writeInterfaceMethods(IndentedWriter writer, JClassType interfaceType) {
		writer.newline();
		writeBindMethod(writer);
		writer.newline();
		writeBeanSetter(writer, interfaceType);
		writer.newline();
		writeBeanGetter(writer, interfaceType);
	}
	
	private void writeBindMethod(IndentedWriter writer) {
		writer.write("public void bind(" + editorType.getQualifiedSourceName() + " editor) {");
		writer.indent();
		writer.write("this.editor = editor;");
		writer.outdent();
		writer.write("}");
	}
	
	private void writeBeanSetter(IndentedWriter writer, JClassType interfaceType) {
		writer.write("public void setBean(" + beanType.getQualifiedSourceName() + " bean) {");
		writer.indent();
		writer.write("this.bean = bean;");
		writeFieldSetters(writer, interfaceType);
		writer.outdent();
		writer.write("}");
	}
	
	private void writeBeanGetter(IndentedWriter writer, JClassType interfaceType) {
		writer.write("public " + beanType.getQualifiedSourceName() + " getBean() {");
		writer.indent();
		writeFieldGetters(writer, interfaceType);
		writer.write("return bean;");
		writer.outdent();
		writer.write("}");
	}
	
	private void writeFieldSetters(IndentedWriter writer, JClassType interfaceType) {
		List<JField> annotatedFields = getAnnotatedFields(interfaceType); 
		
		for (JField field : annotatedFields) {
			writer.write("editor." + field.getName() + ".setValue(bean." + getterForBeanField(field) + ");");
		}
	}
	
	private void writeFieldGetters(IndentedWriter writer, JClassType interfaceType) {
		List<JField> annotatedFields = getAnnotatedFields(interfaceType); 
		
		for (JField field : annotatedFields) {
			writer.write("bean." + setterForBeanField(field) + "(editor." + field.getName() + ".getValue());");
		}
	}
	
	private String getterForBeanField(JField field) {
		return "get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1) + "()";
	}
	
	private String setterForBeanField(JField field) {
		return "set" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1) ;
	}
	
	private List<JField> getAnnotatedFields(JClassType interfaceType) {
		JClassType enclosingType = interfaceType.getEnclosingType();
		List<JField> fields = new ArrayList<>();
		
		for (JField field : enclosingType.getFields()) {
			if (field.isAnnotationPresent(UiField.class) && !field.isAnnotationPresent(Ignore.class)) {
				fields.add(field);
			}
		}
		
		return fields;
	}
}
