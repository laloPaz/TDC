package com.banamex.portal.microservice.ccapplications.domain;

import java.io.Serializable;

public class TdcSecurityEntity implements Serializable{

	private static final long serialVersionUID = -1186408727157811409L;
	
	private double tdcSecurityPK;
	private String tdcSecurityId;
	private int tdcSecurityIntento;
	private String tdcSecurityMask;
	
	public double getTdcSecurityPK() {
		return tdcSecurityPK;
	}
	public void setTdcSecurityPK(double tdcSecurityPK) {
		this.tdcSecurityPK = tdcSecurityPK;
	}
	public String getTdcSecurityId() {
		return tdcSecurityId;
	}
	public void setTdcSecurityId(String tdcSecurityId) {
		this.tdcSecurityId = tdcSecurityId;
	}
	public int getTdcSecurityIntento() {
		return tdcSecurityIntento;
	}
	public void setTdcSecurityIntento(int tdcSecurityIntento) {
		this.tdcSecurityIntento = tdcSecurityIntento;
	}
	
	public void setTdcSecurityMask(String tdcSecurityMask) {
		this.tdcSecurityMask = tdcSecurityMask;
	}

	public String getTdcSecurityMask() {
		return this.tdcSecurityMask;
	}
	
}
