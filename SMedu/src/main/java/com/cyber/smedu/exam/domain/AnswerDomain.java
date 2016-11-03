package com.cyber.smedu.exam.domain;

import java.sql.Timestamp;

public class AnswerDomain {
	
	//�л���� �� ä������ VO
	
	private String answerQuestionCode;
	private String studentCode;
	private String testPaperCode;
	private String examQuestionCode;
	private String professorCode;
	private int answerQuestion; //���
	private Timestamp examDate; //���ó�¥
	private int answerQuestionScore; //����
	private Timestamp markedDate; //ä����¥
	
	public String getAnswerQuestionCode() {
		return answerQuestionCode;
	}
	public void setAnswerQuestionCode(String answerQuestionCode) {
		this.answerQuestionCode = answerQuestionCode;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getTestPaperCode() {
		return testPaperCode;
	}
	public void setTestPaperCode(String testPaperCode) {
		this.testPaperCode = testPaperCode;
	}
	public String getExamQuestionCode() {
		return examQuestionCode;
	}
	public void setExamQuestionCode(String examQuestionCode) {
		this.examQuestionCode = examQuestionCode;
	}
	public String getProfessorCode() {
		return professorCode;
	}
	public void setProfessorCode(String professorCode) {
		this.professorCode = professorCode;
	}
	public int getAnswerQuestion() {
		return answerQuestion;
	}
	public void setAnswerQuestion(int answerQuestion) {
		this.answerQuestion = answerQuestion;
	}
	public Timestamp getExamDate() {
		return examDate;
	}
	public void setExamDate(Timestamp examDate) {
		this.examDate = examDate;
	}
	public int getAnswerQuestionScore() {
		return answerQuestionScore;
	}
	public void setAnswerQuestionScore(int answerQuestionScore) {
		this.answerQuestionScore = answerQuestionScore;
	}
	public Timestamp getMarkedDate() {
		return markedDate;
	}
	public void setMarkedDate(Timestamp markedDate) {
		this.markedDate = markedDate;
	}
	
	@Override
	public String toString() {
		return "AnswerDomain [answerQuestionCode=" + answerQuestionCode + ", studentCode=" + studentCode
				+ ", testPaperCode=" + testPaperCode + ", examQuestionCode=" + examQuestionCode + ", professorCode="
				+ professorCode + ", answerQuestion=" + answerQuestion + ", examDate=" + examDate
				+ ", answerQuestionScore=" + answerQuestionScore + ", markedDate=" + markedDate + "]";
	}
	
	
}
