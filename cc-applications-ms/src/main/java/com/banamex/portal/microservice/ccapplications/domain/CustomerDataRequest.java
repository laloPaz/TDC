package com.banamex.portal.microservice.ccapplications.domain;

import java.io.Serializable;

public class CustomerDataRequest implements Serializable{
	
	
	private static final long serialVersionUID = -8430778106993846808L;
	
	private String folio;
	private String fechaDeNacimiento;
	private String noCliente;
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getNoCliente() {
		return noCliente;
	}
	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

}
