package 연습장.하이;

import java.util.Scanner;

public class 기본_11_ArithmeticExIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력해주세요");
		System.out.println("첫 번째 정수");
		int a = scan.nextInt();
		System.out.println("두 번째 정수");
		int b = scan.nextInt();
		System.out.println("연산자 선택");
		String c = scan.next();
		int d = 0;
		
		if(c.equals("+")) {
			d= a+b;
		}else if(c.equals("-")) {
			d= a-b;
		}else if(c.equals("*")) {
			d= a*b;
		}else if(c.equals("/")) {
			d= a/b;
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println(a+c+b+"의 연산 결과는"+d);
		scan.close();

	}

}
