package 연습장.하이;

import java.util.Scanner;

public class 기본_10_중첩_NestedIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("학년을 입력하세요: ");
		int b = scan.nextInt();



		if(a>60) {
			if(b<4) {
				System.out.println("합격");
			}else if(b>=4&&70>a) {
				System.out.println("불합격");
			}else if(b>=4&&70<=a) {
				System.out.println("합격1");
			}
			

		}else {
			System.out.println("불합격");
		}
		scan.close();

	}
}


