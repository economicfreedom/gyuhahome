package 연습장.하이;

import java.util.Scanner;

public class 기본_5A_ExumMultiply {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3자리의 정수를 입력하세요");
		int a = scan.nextInt();
		
		int hundreds = a/100; // 백의 자리의 숫자
		int ten = (a/10)%10; // 십의 자리의 숫자 a를 10으로 나누면 32.1 여기서 나머지를 구하는 연산자인 %의 값은 3.2 몫 3 나머지는 2 그래서 2로 출력됨
		int units = a%10;//일의 자리 321% 10 32.1 나머지가 1이 되므로 1이 출력됨 
		
		System.out.println(a%10);
		System.out.println("100의 자리와 10의 자리의 합은: "+ (hundreds+ten));
		System.out.println("10의 자리와 1의 자리의 곱은: "+ten*units);
		scan.close();
	}
}
