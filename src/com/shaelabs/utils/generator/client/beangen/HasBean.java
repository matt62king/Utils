package com.shaelabs.utils.generator.client.beangen;

/**
 * @author Matt
 * @since
 */
public interface HasBean<BEAN, EDITOR extends BeanEditor<BEAN>> {
	public void bind(EDITOR editor);
	public void setBean(BEAN bean);
	public BEAN getBean();
}
