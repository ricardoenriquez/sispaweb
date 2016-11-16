/**
 * 
 */
package com.adamantiumsoftware.sispaweb.dominio;

import java.io.Serializable;

/**
 * @author RENRIQUEZ
 *
 */
public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1707221070116603021L;
	private Long id;
	private String nombreRol;
	private String descripcion;
	private Rol rolPadre;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombreRol
	 */
	public String getNombreRol() {
		return nombreRol;
	}

	/**
	 * @param nombreRol
	 *            the nombreRol to set
	 */
	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the rolPadre
	 */
	public Rol getRolPadre() {
		return rolPadre;
	}

	/**
	 * @param rolPadre
	 *            the rolPadre to set
	 */
	public void setRolPadre(Rol rolPadre) {
		this.rolPadre = rolPadre;
	}

}
