package com.shaelabs.utils.generator.client.beangen;

/**
 * @author Matt
 * @since
 */
public interface HasBean<BEAN, EDITOR extends BeanEditor> {
	public void bind(EDITOR editor);
	public void setBean(BEAN bean);
}
