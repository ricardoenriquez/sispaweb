package com.grupodevelopers.sispaweb.comun.excepcion;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class PersistenciaException extends SispaWebException {
	private static final long serialVersionUID = 1L;

	public PersistenciaException(final String codigo, final String keyMensaje) {
		super(codigo, keyMensaje);
	}

	public PersistenciaException(final String keyMensaje) {
		super(keyMensaje);
	}

	public PersistenciaException(final Throwable t, final String codigo, final String keyMensaje) {
		super(t, codigo, keyMensaje);
	}

	public PersistenciaException(final Throwable t, final String keyMensaje) {
		super(t, keyMensaje);
	}
}
