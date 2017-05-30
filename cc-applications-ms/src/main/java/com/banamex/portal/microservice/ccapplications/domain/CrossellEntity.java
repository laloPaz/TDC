package com.banamex.portal.microservice.ccapplications.domain;

import java.io.Serializable;

public class CrossellEntity implements Serializable{
	
	private static final long serialVersionUID = 4287074766757765705L;
	private String crossellClteFolio;
	private Long crosselClteNumero;
	private Long crossellClteProduct3;
	private Long crossellClteProduct1;
	private Long crossellClteProduct2;
	
	public String getCrossellClteFolio() {
		return crossellClteFolio;
	}
	public void setCrossellClteFolio(String crossellClteFolio) {
		this.crossellClteFolio = crossellClteFolio;
	}
	
	public Long getCrosselClteNumero() {
		return crosselClteNumero;
	}
	public void setCrosselClteNumero(Long crosselClteNumero) {
		this.crosselClteNumero = crosselClteNumero;
	}
	
	public Long getCrossellClteProduct3() {
		return crossellClteProduct3;
	}
	public void setCrossellClteProduct3(Long crossellClteProduct3) {
		this.crossellClteProduct3 = crossellClteProduct3;
	}
	
	public Long getCrossellClteProduct1() {
		return crossellClteProduct1;
	}
	public void setCrossellClteProduct1(Long crossellClteProduct1) {
		this.crossellClteProduct1 = crossellClteProduct1;
	}
	
	public Long getCrossellClteProduct2() {
		return crossellClteProduct2;
	}
	public void setCrossellClteProduct2(Long crossellClteProduct2) {
		this.crossellClteProduct2 = crossellClteProduct2;
	}
	 
	
}
