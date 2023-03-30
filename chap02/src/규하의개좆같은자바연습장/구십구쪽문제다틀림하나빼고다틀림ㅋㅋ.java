package 규하의개좆같은자바연습장;

import java.util.Scanner;

public class 구십구쪽문제다틀림하나빼고다틀림ㅋㅋ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//스캐너 선언
		
		System.out.println("[필수 정보 입력]");//여기서 부터 19까지 문자열 입력
		
		System.out.print("1.이름:");
		String name = scanner.nextLine();
		
		System.out.print("2.주민번호 앞 6자리:");
		String ssn = scanner.nextLine();
		
		System.out.print("3.전화번호:");
		String tel = scanner.nextLine();
		//여기 까지 필수 입력 정보를 콘솔에 띄움
		System.out.println();
		
		//여기부턴 이제 필수 정보 입력 후 아래 입력된 문자열과 정보를 띄움
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + ssn);
		System.out.println("3. 전화번호: " + tel);
		
		
	}

}
