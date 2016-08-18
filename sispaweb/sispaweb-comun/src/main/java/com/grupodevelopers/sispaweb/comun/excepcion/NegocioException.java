package com.grupodevelopers.sispaweb.comun.excepcion;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class NegocioException extends SispaWebException {
	private static final long serialVersionUID = 1L;

	public NegocioException(final String codigo, final String keyMensaje) {
		super(codigo, keyMensaje);
	}

	public NegocioException(final String keyMensaje) {
		super(keyMensaje);
	}

	public NegocioException(final Throwable t, final String codigo, final String keyMensaje) {
		super(t, codigo, keyMensaje);
	}

	public NegocioException(final Throwable t, final String keyMensaje) {
		super(t, keyMensaje);
	}

	public NegocioException(final String codigo, final String keyMensaje, final String[] parametros) {
		super(codigo, keyMensaje, parametros);
	}

	public NegocioException(final String keyMensaje, final String... parametros) {
		super(keyMensaje, parametros);
	}
}
