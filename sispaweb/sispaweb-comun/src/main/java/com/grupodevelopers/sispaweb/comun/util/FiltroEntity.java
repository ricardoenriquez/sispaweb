package com.empsii.mithra.comun.util;

import java.io.Serializable;

public class FiltroEntity implements Serializable{

	private TipoFiltro tipoFiltro;
	private Object filtroValue;

	public FiltroEntity(final TipoFiltro tipoFiltro, final Object filtroValue) {
		this.tipoFiltro = tipoFiltro;
		this.filtroValue = filtroValue;
	}

	public TipoFiltro getTipoFiltro() {
		return tipoFiltro;
	}

	public Object getFiltroValue() {
		return filtroValue;
	}

	public enum TipoFiltro {
		LIKE, IGUAL, IN;
	}
}
