package sce01.exam02;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3")); //Board를 호출해서 객체생성후 매개변수 입력
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));

		list.remove(2);// 인덱스 2를 지움 제목3~글쓴이3 삭제 앞당겨져서 인덱스 2는  제목3~이됨
		list.remove(3); //위에서 인덱스가 앞 당겨졌기 떄문에 원래는 인덱스 3은 제목4이지만 현재 인덱스 3이 차지하는건 제목5~라 제목5~가 삭제됨

		for (int i = 0; i < list.size(); i++) {//i에 list를 배열의 크기를 저장 3이 저장될것임
			Board board = list.get(i);// Board에 3개 string subject,content,writer에 3개의 순서대로 인덱스가 저장됨 제목1~,제목2~,제목4~,
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);//저장된 Board에 매개변수를 board로 저장후 각 저장된 인덱스들을 출력
			
		}
	}

}
