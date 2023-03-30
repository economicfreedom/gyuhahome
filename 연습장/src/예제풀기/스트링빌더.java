package 예제풀기;

import java.util.Scanner;

public class 스트링빌더 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StringBuilder 입력받은정보 = new StringBuilder();
		
		String 입력;
		
		while(!(입력 = scan.nextLine()).equals("exit")) {
			입력받은정보.append(입력);
			
		}
		
		System.out.println("입력된 문자열들: "+입력받은정보.toString());

	}

}
