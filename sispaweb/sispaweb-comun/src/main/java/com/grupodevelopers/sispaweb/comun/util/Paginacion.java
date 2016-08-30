package com.grupodevelopers.sispaweb.comun.util;

import java.io.Serializable;

public class Paginacion implements Serializable {
	private static final long serialVersionUID = -8826664316521358338L;

	private int filasPagina;
	private int paginaActual;

	public Paginacion() {
		filasPagina = Number.UNO;
		paginaActual = Number.CINCO;
	}

	public int calcularRegistroInicial() {
		return (paginaActual - 1) * filasPagina;
	}

	public void setFilasPagina(int filasPagina) {
		this.filasPagina = filasPagina;
	}

	public int getFilasPagina() {
		return filasPagina;
	}

	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}

	public int getPaginaActual() {
		return paginaActual;
	}
}
