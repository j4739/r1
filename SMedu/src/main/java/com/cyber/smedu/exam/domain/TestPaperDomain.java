package com.cyber.smedu.exam.domain;

import java.sql.Timestamp;

public class TestPaperDomain {
	
	//������ ���� VO
	
	private String testPaperCode;
	private String openSubjectCode;
	private String academicCalendarCode;
	private Timestamp testTime; //����ð�
	
	public String getTestPaperCode() {
		return testPaperCode;
	}
	public void setTestPaperCode(String testPaperCode) {
		this.testPaperCode = testPaperCode;
	}
	public String getOpenSubjectCode() {
		return openSubjectCode;
	}
	public void setOpenSubjectCode(String openSubjectCode) {
		this.openSubjectCode = openSubjectCode;
	}
	public String getAcademicCalendarCode() {
		return academicCalendarCode;
	}
	public void setAcademicCalendarCode(String academicCalendarCode) {
		this.academicCalendarCode = academicCalendarCode;
	}
	public Timestamp getTestTime() {
		return testTime;
	}
	public void setTestTime(Timestamp testTime) {
		this.testTime = testTime;
	}
	
	@Override
	public String toString() {
		return "TestPaperDomain [testPaperCode=" + testPaperCode + ", openSubjectCode=" + openSubjectCode
				+ ", academicCalendarCode=" + academicCalendarCode + ", testTime=" + testTime + "]";
	}
}
