package 연습장.하이;

import java.util.Scanner;

public class 중급_2_TaxiFare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int income = 0;
		int fare=0;
		for(int i=0; i<10; i++) {
			System.out.println("요금을 입력하세요");
			fare = scan.nextInt();
			income += fare;
			
		}
		System.out.println("총수입"+income);
		scan.close();
		
	}
}
