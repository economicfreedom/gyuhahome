package sce01.exam02;

public class Board {
	String subject; //필드 선언
	String content;
	String writer;
	
	public Board(String suString, String content, String wString) {//객체 생성
		this.subject=suString;
		this.content=content;
		this.writer=wString;
	}
}
