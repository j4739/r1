package com.cyber.smedu.plannerwork.domain;

import java.sql.Date;

public class LearningPlanDomain {

	private String learningPlanCode;
	private String departmentCode;
	private String applicantName;
	private String applicantPhone;
	private String inquireContent;
	private String consultCompleteConfirmation;
	private Date inquireDate;
	private String inquireReplyContent;
	private Date inquireReplyDate;
	
	public String getLearningPlanCode() {
		return learningPlanCode;
	}
	public void setLearningPlanCode(String learningPlanCode) {
		this.learningPlanCode = learningPlanCode;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantPhone() {
		return applicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}
	public String getInquireContent() {
		return inquireContent;
	}
	public void setInquireContent(String inquireContent) {
		this.inquireContent = inquireContent;
	}
	public String getConsultCompleteConfirmation() {
		return consultCompleteConfirmation;
	}
	public void setConsultCompleteConfirmation(String consultCompleteConfirmation) {
		this.consultCompleteConfirmation = consultCompleteConfirmation;
	}
	public Date getInquireDate() {
		return inquireDate;
	}
	public void setInquireDate(Date inquireDate) {
		this.inquireDate = inquireDate;
	}
	public String getInquireReplyContent() {
		return inquireReplyContent;
	}
	public void setInquireReplyContent(String inquireReplyContent) {
		this.inquireReplyContent = inquireReplyContent;
	}
	public Date getInquireReplyDate() {
		return inquireReplyDate;
	}
	public void setInquireReplyDate(Date inquireReplyDate) {
		this.inquireReplyDate = inquireReplyDate;
	}
	@Override
	public String toString() {
		return "LearningPlanDomain [learningPlanCode=" + learningPlanCode + ", departmentCode=" + departmentCode
				+ ", applicantName=" + applicantName + ", applicantPhone=" + applicantPhone + ", inquireContent="
				+ inquireContent + ", consultCompleteConfirmation=" + consultCompleteConfirmation + ", inquireDate="
				+ inquireDate + ", inquireReplyContent=" + inquireReplyContent + ", inquireReplyDate="
				+ inquireReplyDate + "]";
	}
}
