package 연습장.하이;

import java.util.Scanner;

public class 기본_2A_ExCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2개의 실수 입력");
		System.out.print("1번째 실수: ");
		float a = scan.nextFloat();
		
		System.out.print("2번째 실수: ");
		float b = scan.nextFloat();
		
		scan.close();
		System.out.println("두수의 덧셈은 :"+(a+b));
		System.out.println("두수의 뺄셈은 :"+(a-b));
		System.out.println("두수의 곱셈은 :"+(a*b));
		System.out.println("두수의 나눗셈은 :"+(a/b));

	}

}
