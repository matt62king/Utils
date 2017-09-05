package com.shaelabs.utils.generator.client.beangen;

import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.core.ext.typeinfo.JParameter;
import com.google.gwt.uibinder.rebind.IndentedWriter;
import com.shaelabs.utils.generator.client.BaseGenerator;

/**
 * @author Matt
 * @since
 */
public class BeanGenerator extends BaseGenerator {

	@Override
	protected void doGenerate(JClassType interfaceType, String implName, IndentedWriter writer) {
		writeImports(writer, interfaceType);
		writeClassIntro(interfaceType, implName, writer);
		writeFields(writer, interfaceType);
		writeInterfaceMethods(writer, interfaceType);
		writeOutro(writer);	
	}
	
	private void writeImports(IndentedWriter writer, JClassType interfaceType) {
		writer.newline();
	}
	
	private void writeFields(IndentedWriter writer, JClassType interfaceType) {
		for (JMethod method : interfaceType.getImplementedInterfaces()[0].getMethods()) {
			 for (JParameter param : method.getParameters()) {
				 writer.write("private " + param.getType().getQualifiedBinaryName() + " " + param.getName() + ";");
			 }
		}
	}
	
	private void writeInterfaceMethods(IndentedWriter writer, JClassType interfaceType) {
		for (JMethod method : interfaceType.getImplementedInterfaces()[0].getMethods()) {
			StringBuilder sb = new StringBuilder();
			writer.newline();
			
			sb.append("public " + method.getReturnType().getQualifiedSourceName() + " " + method.getName() + "(");
			
			 for (JParameter param : method.getParameters()) {
				 sb.append(param.getType().getQualifiedBinaryName() + " " + param.getName() + ") {");
				 sb.append("\n\tthis." + param.getName() + " = " + param.getName() + ";\t\n}");
			 }
			 
			 writer.write(sb.toString());
		}
	}
}
