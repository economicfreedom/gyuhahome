package 예제풀기;

import java.util.Scanner;

public class 회원정보_입력 {

	public static void main(String[] args) {
		String[] profile = new String[100];
		int i = 0 ;
		String 입력 = "";
		
		Scanner scan = new Scanner(System.in);
		while(!입력.equals("exit")) {
			System.out.print("회원정보 입력");
			입력 = scan.nextLine();
			if(!입력.equals("exit")) {
				profile[i++] = 입력;
			}
		}
		
		for(int j = 0; j<i; j++) {
			System.out.println("입력된 회원정보: "+profile[j]);
		
	}

}
	}
