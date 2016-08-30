package com.grupodevelopers.sispaweb.comun.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionUtil {

	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * Validate given email with regular expression.
	 * 
	 * @param email
	 *            email for validation
	 * @return true valid email, otherwise false
	 */
	public static boolean validarEmail(final String email) {
		Pattern pattern = Pattern.compile(PATTERN_EMAIL);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isNotNullNotEmpty(final String cadena) {
		if (cadena != null && !cadena.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	public static String isNotNull(final Object cadena) {
		if (cadena != null) {
			return cadena.toString();
		}
		return "";
	}
}
