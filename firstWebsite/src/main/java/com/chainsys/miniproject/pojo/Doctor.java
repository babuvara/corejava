package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor {
	private int DOCTOR_ID;
	private String DOCTOR_NAME;
	private Date DOB;
	private String SPECIALITY;
	private String CITY;
	private long PHONE_NO;
	private float STANDARD_FEES;

	public int getDOCTOR_ID() {
		return DOCTOR_ID;
	}

	public void setDOC_ID(int dOC_ID) {
		this.DOCTOR_ID = dOC_ID;
	}

	public String getDOCTOR_NAME() {
		return DOCTOR_NAME;
	}

	public void setDOC_NAME(String dOC_NAME) {
		this.DOCTOR_NAME = dOC_NAME;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}

	public String getSPECIALITY() {
		return SPECIALITY;
	}

	public void setSPECIALITY(String sPECIALITY) {
		this.SPECIALITY = sPECIALITY;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		this.CITY = cITY;
	}

	public long getPHONE_NO() {
		return PHONE_NO;
	}

	public void setPHONE_NO(long phone) {
		this.PHONE_NO = phone;
	}

	public float getSTANDARD_FEES() {
		return STANDARD_FEES;
	}

	public void setFEES(float fEES) {
		this.STANDARD_FEES = fEES;
	}

}