package 연습장.하이;

import java.util.Scanner;

public class 기본_2_SumMultiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두개의 정수 입력");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		System.out.println("두 수의 합은: "+(a+b));
		System.out.println("두 수의 곱은: "+(a*b));
		scan.close();

	}

}
