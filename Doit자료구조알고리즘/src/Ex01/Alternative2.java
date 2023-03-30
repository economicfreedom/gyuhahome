package Ex01;

import java.util.Iterator;
import java.util.Scanner;

public class Alternative2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("+와 -를 번갈아 n개 출렵합니다");
		
		do {
			System.out.println("n의 값: ");
			n=scan.nextInt();
		} while (n<0);
		for (int i = 1; i <=n/2; i++) {
			System.out.print("+-");
			
		}
		if(n%2 !=0)
			System.out.print("+");
		
		
	}
}
