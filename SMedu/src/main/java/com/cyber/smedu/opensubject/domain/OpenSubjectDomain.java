package com.cyber.smedu.opensubject.domain;

import java.sql.Date;

public class OpenSubjectDomain {
	private String openSubjectCode;
	private String cardinalCode;
	private String professorCode;
	private String subjectCode;
	private String bookCode;
	private String cardinal;
	private String professorName;
	private String subjectName;
	private String bookName;
	private Date registerDate;
	
	public String getOpenSubjectCode() {
		return openSubjectCode;
	}
	public void setOpenSubjectCode(String openSubjectCode) {
		this.openSubjectCode = openSubjectCode;
	}
	public String getCardinalCode() {
		return cardinalCode;
	}
	public void setCardinalCode(String cardinalCode) {
		this.cardinalCode = cardinalCode;
	}
	public String getProfessorCode() {
		return professorCode;
	}
	public void setProfessorCode(String professorCode) {
		this.professorCode = professorCode;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getCardinal() {
		return cardinal;
	}
	public void setCardinal(String cardinal) {
		this.cardinal = cardinal;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "OpenSubjectDomain [openSubjectCode=" + openSubjectCode + ", cardinalCode=" + cardinalCode
				+ ", professorCode=" + professorCode + ", subjectCode=" + subjectCode + ", bookCode=" + bookCode
				+ ", cardinal=" + cardinal + ", professorName=" + professorName + ", subjectName=" + subjectName
				+ ", bookName=" + bookName + ", registerDate=" + registerDate + "]";
	}
}
