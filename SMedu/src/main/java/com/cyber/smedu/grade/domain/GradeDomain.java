package com.cyber.smedu.grade.domain;

public class GradeDomain {
	private String gradeCode;
	private String studentCode;
	private String openSubjectCode;
	private String gradeEvaluationCategory;
	private int gradeScore;
	private char participationState;
	public String getGradeCode() {
		return gradeCode;
	}
	public void setGradeCode(String gradeCode) {
		this.gradeCode = gradeCode;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public String getOpenSubjectCode() {
		return openSubjectCode;
	}
	public void setOpenSubjectCode(String openSubjectCode) {
		this.openSubjectCode = openSubjectCode;
	}
	public String getGradeEvaluationCategory() {
		return gradeEvaluationCategory;
	}
	public void setGradeEvaluationCategory(String gradeEvaluationCategory) {
		this.gradeEvaluationCategory = gradeEvaluationCategory;
	}
	public int getGradeScore() {
		return gradeScore;
	}
	public void setGradeScore(int gradeScore) {
		this.gradeScore = gradeScore;
	}
	public char getParticipationState() {
		return participationState;
	}
	public void setParticipationState(char participationState) {
		this.participationState = participationState;
	}
	
	@Override
	public String toString() {
		return "GradeDomain [gradeCode=" + gradeCode + ", studentCode=" + studentCode + ", openSubjectCode="
				+ openSubjectCode + ", gradeEvaluationCategory=" + gradeEvaluationCategory + ", gradeScore="
				+ gradeScore + ", participationState=" + participationState + "]";
	}
	
}
