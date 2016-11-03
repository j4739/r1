package com.cyber.smedu.board.domain;

import java.sql.Date;

public class BoardArticleDomain {
	
	private String boardArticleCode;
	private String userCode;
	private String boardCode;
	private String boardArticleTitle;
	private String boardArticleWriter;
	private String boardArticleContent;
	private int boardReplyGroup;
	private int boardReplyLevel;
	private int boardReplySeq;
	private int boardArticleReadCount;
	private Date boardArticleDate;
	
	public String getBoardArticleCode() {
		return boardArticleCode;
	}
	public void setBoardArticleCode(String boardArticleCode) {
		this.boardArticleCode = boardArticleCode;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public String getBoardArticleTitle() {
		return boardArticleTitle;
	}
	public void setBoardArticleTitle(String boardArticleTitle) {
		this.boardArticleTitle = boardArticleTitle;
	}
	public String getBoardArticleWriter() {
		return boardArticleWriter;
	}
	public void setBoardArticleWriter(String boardArticleWriter) {
		this.boardArticleWriter = boardArticleWriter;
	}
	public String getBoardArticleContent() {
		return boardArticleContent;
	}
	public void setBoardArticleContent(String boardArticleContent) {
		this.boardArticleContent = boardArticleContent;
	}
	public int getBoardReplyGroup() {
		return boardReplyGroup;
	}
	public void setBoardReplyGroup(int boardReplyGroup) {
		this.boardReplyGroup = boardReplyGroup;
	}
	public int getBoardReplyLevel() {
		return boardReplyLevel;
	}
	public void setBoardReplyLevel(int boardReplyLevel) {
		this.boardReplyLevel = boardReplyLevel;
	}
	public int getBoardReplySeq() {
		return boardReplySeq;
	}
	public void setBoardReplySeq(int boardReplySeq) {
		this.boardReplySeq = boardReplySeq;
	}
	public int getBoardArticleReadCount() {
		return boardArticleReadCount;
	}
	public void setBoardArticleReadCount(int boardArticleReadCount) {
		this.boardArticleReadCount = boardArticleReadCount;
	}
	public Date getBoardArticleDate() {
		return boardArticleDate;
	}
	public void setBoardArticleDate(Date boardArticleDate) {
		this.boardArticleDate = boardArticleDate;
	}
	
	@Override
	public String toString() {
		return "BoardArticleDomain [boardArticleCode=" + boardArticleCode + ", userCode=" + userCode + ", boardCode="
				+ boardCode + ", boardArticleTitle=" + boardArticleTitle + ", boardArticleWriter=" + boardArticleWriter
				+ ", boardArticleContent=" + boardArticleContent + ", boardReplyGroup=" + boardReplyGroup
				+ ", boardReplyLevel=" + boardReplyLevel + ", boardReplySeq=" + boardReplySeq
				+ ", boardArticleReadCount=" + boardArticleReadCount + ", boardArticleDate=" + boardArticleDate + "]";
	}
	
	
	
}
