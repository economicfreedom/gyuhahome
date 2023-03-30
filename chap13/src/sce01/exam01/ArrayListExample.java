package sce01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // String 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //앞에 있는 Servlet/JSP가 3번으로 가고 Database가 2번으로 감
		list.add("iBATIS");
		
		int size = list.size(); //크기를 변수에 입력됨
		System.out.println("총 객체수: "+size);//입력된 문자열이 5개라 5로 저장됨
		System.out.println();
		
		
		String skill = list.get(3);//2번 인덱스의 객체를 얻음(앞에 database를 인덱스 2번으로 설정함)
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {//저장된 총 객체 수만큼 루핑 Java,JDBC,Servelt/JSP,Database,iBATIS가 i에 루핑됨
			String str =list.get(i); // str에 i에 저장된 5개의 인덱스가 루핑되고 
			System.out.println(i+":"+str);//list.get(i) = 5개의 인덱스를 지니고 있음 str은 list.get(i)가 지니고 있는 5개의 인덱스가 저장됨 i는 0~4까지 저장돼 있으니 0~4를 출력함
		}
		System.out.println();
		
		
		list.remove(2); //2번 인덱스를 지움 여기서 database가 삭제됨
		list.remove(2);//2번 인덱스를 지우는데 앞에서 database가 삭제돼서 2번 인덱스가 Servelt/JSP,Database가 되어서 remove(2)를 사용하면 Servelt/JSP,Database 가 지워짐
		list.remove("iBATIS");//iBATIS를 삭제함
		
		for (int i = 0; i < list.size(); i++) { // 다시 루핑해서 i에 list 갯수만큼 저장시킴
			String str = list.get(i); //str은 Java,JDBC를 가지고 i는 0~1 두개의 인덱스를 가져서 크기가 2가됨
			System.out.println(i+":"+str);//위에것들을 출력함 출력될때 0:Java,1:JDBC가 출력됨 위에서 3개를 삭제 했기 때문
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
