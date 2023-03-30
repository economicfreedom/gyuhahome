package sec03.예재;

public class Board {
	String titel;
	String content;
	String writer;
	String date;
	int hitcount;
	
		

	Board(String titel,String content){
		this(titel,content,"로그인한 회원아이디","현재 컴퓨터 날짜",0);	
}
	Board(String titel,String content,String writer){
		this(titel,content,writer,"현재 컴퓨터 날짜",0);
		
	}
	Board(String titel,String content,String writer,String date){
		this(titel,content,writer,date,0);
	}
	Board(String titel,String content,String writer,String date,int hitcount){
		this.titel=titel;
		this.content=content;
		this.writer=writer;
		this.date=date;
		this.hitcount=hitcount;
}
}


