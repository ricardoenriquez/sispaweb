package com.grupodevelopers.sispaweb.comun.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilidadComun {

	private static final Logger LOG = LogManager.getLogger(UtilidadComun.class.getName());

	public static void agregarWhere(final StringBuilder where) {
		if (where.length() == 0) {
			where.append(" WHERE ");
		} else {
			where.append(" AND ");
		}
	}

	public static <T> List<T> addListFirts(List<T> list, T addObject) {
		final List<T> listaTmp = new ArrayList<>();
		listaTmp.add(addObject);
		listaTmp.addAll(list);
		return listaTmp;
	}

	public static <T> T getServicio(final String jdni, final Class<T> claseServicio) {
		try {
			final Context ctx = new InitialContext();
			return claseServicio.cast(ctx.lookup(jdni));
		} catch (final NamingException e) {
			LOG.fatal("Servicio no disponible", e);
			throw new IllegalStateException("Servicio no disponible", e);
		}
	}

	public static boolean compararDiferenciaDate(final Date var1, final Date var2) {
		if ((var1 == null && var2 != null) || (var1 != null && var2 == null)) {
			return true;
		}
		if (var1 == null && var2 == null) {
			return false;
		}
		if (!var1.equals(var2)) {
			return true;
		}
		return false;
	}

	public static boolean compararDiferenciaBigDecimal(final BigDecimal var1, final BigDecimal var2) {
		if ((var1 == null && var2 != null) || (var1 != null && var2 == null)) {
			return true;
		}
		if (var1 == null && var2 == null) {
			return false;
		}
		if (!(var1.compareTo(var2) == 0)) {
			return true;
		}
		return false;
	}

	public static boolean compararDiferenciasString(final String var1, final String var2) {
		if ((var1 == null && var2 != null) || (var1 != null && var2 == null)) {
			return true;
		}
		if (var1 == null && var2 == null) {
			return false;
		}
		if (!var1.equals(var2)) {
			return true;
		}
		return false;
	}

	public static boolean compararDiferenciasLong(final Long var1, final Long var2) {
		if ((var1 == null && var2 != null) || (var1 != null && var2 == null)) {
			return true;
		}
		if (var1 == null && var2 == null) {
			return false;
		}
		if (var1.compareTo(var2) != 0) {
			return true;
		}
		return false;
	}

	public static boolean compararDiferenciasInteger(final Integer var1, final Integer var2) {
		if ((var1 == null && var2 != null) || (var1 != null && var2 == null)) {
			return true;
		}
		if (var1 == null && var2 == null) {
			return false;
		}
		if (var1.compareTo(var2) != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Valida si el objecto es nulo
	 *
	 * @param object
	 * @return true, si el objecto es nulo, false caso contrario
	 */
	public static <T> boolean esNulo(T object) {
		return (object == null);
	}

	/**
	 * Valida si el objecto no es nulo
	 *
	 * @param object
	 * @return true, si el objecto no es nulo, false caso contrario
	 */
	public static <T> boolean noEsNulo(T object) {
		return !(object == null);
	}

	/**
	 * Agrega a una lista un objecto dado
	 *
	 * @param listaObject
	 *            , lista donde se va almacenar el objecto
	 * @param object
	 *            , el objecto a guardar
	 * @return {@value List<T>}, retorna la lista de objectos
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> agregarObjectList(List<T> listaObject, Object object) {
		// Valida si la lista esta vacia
		if (esNulo(listaObject)) {
			// si esta vacia, reservar espacio de memoria
			listaObject = new ArrayList<T>();
		}
		// Adjuntar el objecto a la lista
		listaObject.add((T) object);
		// Retornar la lista
		return listaObject;
	}
	

/**
 * Convierte un String a String con formato number
 * @param numero
 * @param format
 * @return
 */
	public static String getFormat(String numero, String format) {
		DecimalFormat df2 = new DecimalFormat(format);
		Double numeroD= Double.parseDouble(numero);
		return df2.format(numeroD);
	}

}
