package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment {
	private int APPOIMENT_ID;
	private Date APPOIMENT_DATE;
	private int DOC_ID;
	private String PATIENT_NAME;
	private float FEES_COLLECTED;

	public int getAPPOIMENT_ID() {
		return APPOIMENT_ID;
	}

	public void setAPPOIMENT_ID(int aPPOIMENT_ID) {
		this.APPOIMENT_ID = aPPOIMENT_ID;
	}

	public Date getAPPOIMENT_DATE() {
		return APPOIMENT_DATE;
	}

	public void setAPPOIMENT_DATE(Date aPPOIMENT_DATE) {
		this.APPOIMENT_DATE = aPPOIMENT_DATE;
	}

	public int getDOC_ID() {
		return DOC_ID;
	}

	public void setDOC_ID(int dOC_ID) {
		this.DOC_ID = dOC_ID;
	}

	public String getPATIENT_NAME() {
		return PATIENT_NAME;
	}

	public void setPATIENT_NAME(String pATIENT_NAME) {
		this.PATIENT_NAME = pATIENT_NAME;
	}

	public float getFEES_COLLECTED() {
		return FEES_COLLECTED;
	}

	public void setFEES_COLLECTED(float fees) {
		this.FEES_COLLECTED = fees;
	}

}
