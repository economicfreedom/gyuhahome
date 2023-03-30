package Ex03_퀴즈;

import java.util.Iterator;
import java.util.Scanner;

public class Q3 {
	static int searchIdx(int[] a,int n , int key,int[] idx) {
		
		
		int x = 0;
		for (int j2 = 0; j2 < a.length; j2++) {

			if (a[j2]==key) {
				idx[x]=j2;
				System.out.printf("%2d",idx[x]);
				x++;

			}
			
		}
		System.out.println();
		return x;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요솟수를 입력하세요");
		int n = scan.nextInt();
		int[] a = new int[n+1];

		System.out.print("저장할 값을 입력하세요 ");
		for (int i = 0; i < n; i++) {
			a[i] =scan.nextInt();
		}
		
		
		System.out.print("검색 할 값을 입력하세요 ");
		int key = scan.nextInt();
		n=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==key) {
				n++;
				
			}
		}
		int[] idx = new int[n];
		
		

		System.out.println(searchIdx(a, n, key, idx));
	}
}
