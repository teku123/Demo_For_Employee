package com.util;

import org.apache.commons.lang.StringUtils;

public class CamelCaseConverter {

	public static String convertStringIntoCamelCase(String input) {
		String result = StringUtils.capitalize(input);
		return result;
	}
}
