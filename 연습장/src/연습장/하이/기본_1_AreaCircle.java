package 연습장.하이;


import java.util.Scanner;

public class 기본_1_AreaCircle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		double area =scan.nextInt();
		
		double a = area*3.14;
		
		System.out.println("원의 면적: "+a);
		scan.close();
		
		
		
		
	}
}
