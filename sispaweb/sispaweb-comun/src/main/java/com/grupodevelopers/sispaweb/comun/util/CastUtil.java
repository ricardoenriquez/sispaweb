package com.empsii.mithra.comun.util;

import java.math.BigDecimal;

public class CastUtil {

	public static BigDecimal castObjectToBigdecimal(final Object object) {
		if (ValidacionUtil.isNotNullNotEmpty(object.toString())) {
			return new BigDecimal(object.toString());
		}
		return null;
	}

	public static Long castObjectToLong(final Object object) {
		if (ValidacionUtil.isNotNullNotEmpty(object.toString())) {
			return Long.parseLong(object.toString());
		}
		return null;
	}

	public static Float castObjectToFloat(final Object object) {
		if (ValidacionUtil.isNotNullNotEmpty(object.toString())) {
			return Float.valueOf(object.toString());
		}
		return null;
	}
}
