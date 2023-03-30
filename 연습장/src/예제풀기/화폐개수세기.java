package 예제풀기;

import java.util.Scanner;

public class 화폐개수세기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("화폐계산기");
		int a = Integer.parseInt(scan.nextLine());


		System.out.println("10원권"+(a/10)+"개");
		a = a%10;
	}
}
