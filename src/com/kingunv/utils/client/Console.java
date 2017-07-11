package com.kingunv.utils.client;

/**
 * Methods for logging to the browser console
 * 
 * @author Matt
 * @since 0.1
 */
public class Console {
	
	public static native void log(String text) /*-{ console.log(text); }-*/;
	public static native void log(int i) /*-{ console.log(i); }-*/;
	public static native void log(boolean b) /*-{ console.log(b); }-*/;
	public static native void log(float f) /*-{ console.log(f); }-*/;
	public static native void log(double d) /*-{ console.log(d); }-*/;
	
}
