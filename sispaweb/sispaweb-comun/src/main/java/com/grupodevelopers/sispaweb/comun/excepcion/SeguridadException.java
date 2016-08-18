package com.grupodevelopers.sispaweb.comun.excepcion;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class SeguridadException extends SispaWebException {
	private static final long serialVersionUID = 1L;

	public SeguridadException(final String codigo, final String keyMensaje) {
		super(codigo, keyMensaje);
	}

	public SeguridadException(final String keyMensaje) {
		super(keyMensaje);
	}

	public SeguridadException(final Throwable t, final String codigo, final String keyMensaje) {
		super(t, codigo, keyMensaje);
	}

	public SeguridadException(final Throwable t, final String keyMensaje) {
		super(t, keyMensaje);
	}
}
