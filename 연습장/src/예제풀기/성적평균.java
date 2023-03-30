package 예제풀기;

import java.util.Scanner;

public class 성적평균 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String 이름 = null;
		int 국어 = 0, 영어 = 0, 수학 = 0;
		
		while (이름 == null) {
			System.out.print("이름을 입력하세요: ");
			이름 = scan.nextLine();

			
			if (이름.matches("^[0-9]+$")) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				이름 = null;
				
			}
		}
		
		while (국어 == 0) {
			try {
				System.out.print("국어점수를 입력하세요: ");
				국어 = scan.nextInt();
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				scan.nextLine();
			}
		}
		
		while (영어 == 0) {
			try {
				System.out.print("영어점수를 입력하세요: ");
				영어 = scan.nextInt();
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				scan.nextLine();
			}
		}
		
		while (수학 == 0) {
			try {
				System.out.print("수학점수를 입력하세요: ");
				수학 = scan.nextInt();
			}catch(Exception e){
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				scan.nextLine();
		
			}
		System.out.println(수학+영어+국어);
		}
	}
}