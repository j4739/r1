package com.cyber.smedu.plannerwork.domain;

import java.sql.Date;

public class PlanRecordDomain {
	
	private String planCode;
	private String plannerStudentCode;
	private String planContent;
	private Date planDate;
	private String specialNote;
	
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getPlannerStudentCode() {
		return plannerStudentCode;
	}
	public void setPlannerStudentCode(String plannerStudentCode) {
		this.plannerStudentCode = plannerStudentCode;
	}
	public String getPlanContent() {
		return planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public String getSpecialNote() {
		return specialNote;
	}
	public void setSpecialNote(String specialNote) {
		this.specialNote = specialNote;
	}
	
	@Override
	public String toString() {
		return "PlanRecordDomain [planCode=" + planCode + ", plannerStudentCode=" + plannerStudentCode
				+ ", planContent=" + planContent + ", planDate=" + planDate + ", specialNote=" + specialNote + "]";
	}
}
