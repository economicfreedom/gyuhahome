package 연습장.하이;

import java.util.Scanner;

public class 기본_14_computerBalance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구매금액을 입력하세요");
		int 구매금액 = scan.nextInt();
		int 청구금액 = 0;
		
		
		
		
		if(구매금액>=300000) {
			청구금액 = 구매금액 - 30000;
		}else if(구매금액<300000&&구매금액>=100000) {
			청구금액 = 구매금액 - 5000;
		}else if(구매금액<100000) {
			청구금액 = 구매금액;
		}
		
		System.out.println("구매금액 = "+구매금액);
		System.out.println("청구금액 = "+청구금액);
		

	}

}
