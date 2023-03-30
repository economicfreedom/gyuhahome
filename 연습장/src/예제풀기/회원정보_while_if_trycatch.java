package 예제풀기;

import java.util.Scanner;

public class 회원정보_while_if_trycatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] 회원정보 = new String[3];
		boolean 성공 = false;
		try {
			System.out.println("회원정보를 입력해주세요");
			System.out.print("이름을 입력해주세요: ");
			회원정보[0] = scan.nextLine();
			System.out.println("나이");
			회원정보[1] = scan.nextLine();
			System.out.print("번호를 입력해주세요");
			회원정보[1] = scan.nextLine();
		}catch(Exception e) {
			System.out.println("문자만 입력해주세요");
			
			
			
			
		}
		
	}

}
