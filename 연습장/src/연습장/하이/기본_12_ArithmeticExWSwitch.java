package 연습장.하이;

import java.util.Scanner;

public class 기본_12_ArithmeticExWSwitch {
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
		
			
		switch(c) {
			
		case "+":
			d=a+b;
			System.out.println(a+c+b+"의 연산결과는"+d);
			break;
			
		case "-":
			d=a-b;
			System.out.println(a+c+b+"의 연산결과는"+d);
			break;
			
		case "*":
			d=a*b;
			System.out.println(a+c+b+"의 연산결과는"+d);
			break;
		case "/":
			if(b>0) {
			d=a/b;
			System.out.println(a+c+b+"의 연산결과는"+d);
			break;
			}else {
				System.out.println("0으로는 나눌 수 없습니다");
				break;
			}
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}

			
		scan.close();
		}
	}

