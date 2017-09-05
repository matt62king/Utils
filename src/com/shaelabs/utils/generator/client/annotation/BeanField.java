package com.shaelabs.utils.generator.client.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Matt
 * @since
 */
@Documented @Target(ElementType.FIELD) @Retention(RetentionPolicy.RUNTIME)
public @interface BeanField {
	public String name();
}
