package 연습장.하이;

import java.util.Scanner;

public class 기본_9_SeasonExSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		while(true) {
		if(scan.hasNextInt()) {
		int a = scan.nextInt();
		
		switch(a) {
			
		
		
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			
		}
		break;
		}else { 
			System.out.println("숫자가 아닙니다.");
			scan.nextLine();
		}
		
			
			
			
		
		
		}
		scan.close();
		
		
		
		
		
		
		
		

	}

}
