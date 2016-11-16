/**
 * 
 */
package com.adamantiumsoftware.sispaweb.dominio;

import java.io.Serializable;

/**
 * @author RENRIQUEZ
 *
 */
public class Parroquia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1604714837570791056L;
	private Long id;
	private Arquidiocesis arquidiocesis;
	private Diocesis diocesis;
	private String nombre;
	private String direccion;
	private String telefono;
	private String celular;
	private String correo;
	private String paginaWeb;
	private String historico;
	private Estado estado;

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
	 * @return the arquidiocesis
	 */
	public Arquidiocesis getArquidiocesis() {
		return arquidiocesis;
	}

	/**
	 * @param arquidiocesis
	 *            the arquidiocesis to set
	 */
	public void setArquidiocesis(Arquidiocesis arquidiocesis) {
		this.arquidiocesis = arquidiocesis;
	}

	/**
	 * @return the diocesis
	 */
	public Diocesis getDiocesis() {
		return diocesis;
	}

	/**
	 * @param diocesis
	 *            the diocesis to set
	 */
	public void setDiocesis(Diocesis diocesis) {
		this.diocesis = diocesis;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 *            the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo
	 *            the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the paginaWeb
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * @param paginaWeb
	 *            the paginaWeb to set
	 */
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	/**
	 * @return the historico
	 */
	public String getHistorico() {
		return historico;
	}

	/**
	 * @param historico
	 *            the historico to set
	 */
	public void setHistorico(String historico) {
		this.historico = historico;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
