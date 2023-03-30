package 연습장.하이;

import java.util.Scanner;

public class 기본_4_Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>>");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();

		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("삼각형이 됩니다.");
		}else {
			System.out.println("삼각형이 안 됩니다.");
		}
		scan.close();
	}

}
