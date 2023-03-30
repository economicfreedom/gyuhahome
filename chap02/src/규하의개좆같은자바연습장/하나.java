package 규하의개좆같은자바연습장;

import java.util.Scanner;

public class 하나 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("[개인정보입력]");
		
		System.out.print("이름:");
		String name = scanner.nextLine();
		
		System.out.print("나이:");
		String age = scanner.nextLine();
		
		System.out.print("전화번호:");
		String tel = scanner.nextLine();
		
		System.out.print("가족구성:");
		String fam = scanner.nextLine();
		 
		System.out.print("나의취미:");
		String hobby = scanner.nextLine();
		
	
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("전화번호:"+tel);
		System.out.println("가족구성:"+fam);
		System.out.println("나의취미:"+hobby);
		
		System.out.print("입력 완료");
		
		
		
		

	}

}
