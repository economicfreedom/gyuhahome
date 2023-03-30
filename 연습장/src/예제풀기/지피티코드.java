package 예제풀기;

import java.util.Scanner;

public class 지피티코드 {

	public static void main(String[] args) {

		        String[] profile = new String[100];
		        int i = 0;
		        String input = "";

		        Scanner scan = new Scanner(System.in);
		        while (!input.equals("exit")) {
		            System.out.print("회원 정보를 입력하세요: ");
		            input = scan.nextLine();
		            if (!input.equals("exit")) {
		                profile[i++] = input;
		            }
		        }

		        for (int j = 0; j < i; j++) {
		            System.out.println("회원 정보: " + profile[j]);
		        }
	}
}
