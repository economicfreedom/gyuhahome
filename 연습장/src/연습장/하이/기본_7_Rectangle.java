package 연습장.하이;

import java.util.Scanner;

public class 기본_7_Rectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		
		if((x<=100&&y<=100)||(x<=200&&y<=200)) {
			System.out.println("사각형안에 있습니다");
			
		}else {
			System.out.println("사각형안에 없습니다");
		}
		scan.close();
		
	}
}
