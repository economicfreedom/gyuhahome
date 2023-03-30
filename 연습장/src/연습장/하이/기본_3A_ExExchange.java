package 연습장.하이;

import java.util.Scanner;

public class 기본_3A_ExExchange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = scan.nextInt();
		
		double $ = (double)won/1200;
		double € = (double)won/1500;
		System.out.println(won+"원은 $"+$+"입니다.");
		System.out.println(won+"원은 $"+€+"입니다.");
		
		scan.close();
	}

}
