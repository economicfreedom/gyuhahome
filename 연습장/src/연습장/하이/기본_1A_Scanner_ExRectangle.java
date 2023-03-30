package 연습장.하이;

import java.util.Scanner;

public class 기본_1A_Scanner_ExRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로를 입력하세요");
		double a = scan.nextDouble();
		
		System.out.println("세로를 입력하세요");
		double b = scan.nextDouble();
		
		System.out.println("사각형의 면적은: "+a*b+"입니다.");
		scan.close();
		
	}

}
