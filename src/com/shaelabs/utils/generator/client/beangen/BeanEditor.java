package com.shaelabs.utils.generator.client.beangen;

/**
 * @author Matt
 * @since
 */
public interface BeanEditor<BEAN> {
	public void setBean(BEAN bean);
	public BEAN getBean();
}
