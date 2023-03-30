package 연습장.하이;

import java.util.Scanner;

public class 기본_8_SeasonExlf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("달을 입력하세요>>");
		if(scan.hasNext()) {
			int a = scan.nextInt();
		 
		if(a>=3&&a<6) {
			System.out.println("봄");
			
		}else if(a>=6&&a<9) {
			System.out.println("여름");
		}else if(a>=9&&a<=11) {
			System.out.println("가을");
		}else if(a==12||a==1||a==2) {
			System.out.println("겨울");
			break;
			
		}else {
			System.out.println("실패");
		}
		}else {
			System.out.println("입력하신 값이 숫자가 아닙니다");
			scan.nextLine();
		}
		
		}
		scan.close();
	}
}
