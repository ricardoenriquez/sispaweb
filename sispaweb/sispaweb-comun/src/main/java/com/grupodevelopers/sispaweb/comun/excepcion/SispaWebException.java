package com.grupodevelopers.sispaweb.comun.excepcion;

public class SispaWebException extends Exception {
	private static final long serialVersionUID = -4093440428672211881L;
	private String codigo;
	private String keyMensaje;
	private String[] parametros;

	public SispaWebException(final Throwable t, final String keyMensaje) {
		super(t);
		this.keyMensaje = keyMensaje;
	}

	public SispaWebException(final Throwable t, final String codigo, final String keyMensaje) {
		super(t);
		this.codigo = codigo;
		this.keyMensaje = keyMensaje;
	}

	public SispaWebException(final String keyMensaje) {
		this.keyMensaje = keyMensaje;
	}

	public SispaWebException(final String codigo, final String keyMensaje) {
		this.codigo = codigo;
		this.keyMensaje = keyMensaje;
	}

	public SispaWebException(final String codigo, final String keyMensaje, final String... parametros) {
		this.codigo = codigo;
		this.keyMensaje = keyMensaje;
		this.parametros = parametros;
	}


	public SispaWebException(final String keyMensaje, final String... parametros) {
		this.keyMensaje = keyMensaje;
		this.parametros = parametros;
	}

	// Setter's and Getter's
	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setParametros(String[] parametros) {
		this.parametros = parametros;
	}

	public String[] getParametros() {
		return parametros;
	}

	public void setKeyMensaje(final String keyMensaje) {
		this.keyMensaje = keyMensaje;
	}

	public String getKeyMensaje() {
		return keyMensaje;
	}
}
