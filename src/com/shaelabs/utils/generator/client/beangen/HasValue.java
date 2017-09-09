package com.shaelabs.utils.generator.client.beangen;

/**
 * Interface to make fields compatible with Bean editor
 * 
 * @author Matt
 * @since 0.1
 */
public interface HasValue<T> {
	public void setValue(T value);
	public T getValue();
}
