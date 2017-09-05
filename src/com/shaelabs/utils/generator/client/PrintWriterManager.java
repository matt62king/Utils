package com.shaelabs.utils.generator.client;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.shared.GWT;

class PrintWriterManager {
	private final GeneratorContext genCtx;
	private final String packageName;
	private final TreeLogger logger;
	private final Set<PrintWriter> writers = new HashSet<PrintWriter>();
	
	public PrintWriterManager(GeneratorContext genCtx, TreeLogger logger,String packageName) {
		this.genCtx = genCtx;
		this.packageName = packageName;
		this.logger = logger;
	}

	public void commit() {
		for (PrintWriter writer : writers) {
			genCtx.commit(logger, writer);
		}
	}

	public PrintWriter makePrintWriterFor(String name) {
		PrintWriter writer = tryToMakePrintWriterFor(name);
	
		if (writer == null) {
			throw new RuntimeException(String.format("Tried to write %s.%s twice.", packageName, name));
		}
	
		return writer;
	}
	 
	public PrintWriter tryToMakePrintWriterFor(String name) {
		PrintWriter writer = genCtx.tryCreate(logger, packageName, name);
		GWT.log("Print writer for: " + name);
		
		if (writer != null) {
			writers.add(writer);
		}
	
		return writer;
	}
}
