/**
 * 
 */
package com.adamantiumsoftware.sispaweb.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 * @author RENRIQUEZ
 *
 */
public class Matrimonio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8569528005599033981L;
	private Long id;
	private String libro;
	private String folio;
	private String numero;
	private Date fechaCeremonio;
	private String notaMarginal;
	private String notaMarginal2;
	private Empleado empleadoCelebra;
	private Empleado empleadoDaFe;
	private Persona esposo;
	private Persona esposa;
	private Persona padrino;
	private Persona madrina;
	private Parroquia parroquia;

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
	 * @return the libro
	 */
	public String getLibro() {
		return libro;
	}

	/**
	 * @param libro
	 *            the libro to set
	 */
	public void setLibro(String libro) {
		this.libro = libro;
	}

	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}

	/**
	 * @param folio
	 *            the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the fechaCeremonio
	 */
	public Date getFechaCeremonio() {
		return fechaCeremonio;
	}

	/**
	 * @param fechaCeremonio
	 *            the fechaCeremonio to set
	 */
	public void setFechaCeremonio(Date fechaCeremonio) {
		this.fechaCeremonio = fechaCeremonio;
	}

	/**
	 * @return the empleadoCelebra
	 */
	public Empleado getEmpleadoCelebra() {
		return empleadoCelebra;
	}

	/**
	 * @param empleadoCelebra
	 *            the empleadoCelebra to set
	 */
	public void setEmpleadoCelebra(Empleado empleadoCelebra) {
		this.empleadoCelebra = empleadoCelebra;
	}

	/**
	 * @return the empleadoDaFe
	 */
	public Empleado getEmpleadoDaFe() {
		return empleadoDaFe;
	}

	/**
	 * @param empleadoDaFe
	 *            the empleadoDaFe to set
	 */
	public void setEmpleadoDaFe(Empleado empleadoDaFe) {
		this.empleadoDaFe = empleadoDaFe;
	}

	/**
	 * @return the parroquia
	 */
	public Parroquia getParroquia() {
		return parroquia;
	}

	/**
	 * @param parroquia
	 *            the parroquia to set
	 */
	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	/**
	 * @return the notaMarginal
	 */
	public String getNotaMarginal() {
		return notaMarginal;
	}

	/**
	 * @param notaMarginal
	 *            the notaMarginal to set
	 */
	public void setNotaMarginal(String notaMarginal) {
		this.notaMarginal = notaMarginal;
	}

	/**
	 * @return the notaMarginal2
	 */
	public String getNotaMarginal2() {
		return notaMarginal2;
	}

	/**
	 * @param notaMarginal2
	 *            the notaMarginal2 to set
	 */
	public void setNotaMarginal2(String notaMarginal2) {
		this.notaMarginal2 = notaMarginal2;
	}

	/**
	 * @return the esposo
	 */
	public Persona getEsposo() {
		return esposo;
	}

	/**
	 * @param esposo
	 *            the esposo to set
	 */
	public void setEsposo(Persona esposo) {
		this.esposo = esposo;
	}

	/**
	 * @return the esposa
	 */
	public Persona getEsposa() {
		return esposa;
	}

	/**
	 * @param esposa
	 *            the esposa to set
	 */
	public void setEsposa(Persona esposa) {
		this.esposa = esposa;
	}

	/**
	 * @return the padrino
	 */
	public Persona getPadrino() {
		return padrino;
	}

	/**
	 * @param padrino
	 *            the padrino to set
	 */
	public void setPadrino(Persona padrino) {
		this.padrino = padrino;
	}

	/**
	 * @return the madrina
	 */
	public Persona getMadrina() {
		return madrina;
	}

	/**
	 * @param madrina
	 *            the madrina to set
	 */
	public void setMadrina(Persona madrina) {
		this.madrina = madrina;
	}

}
