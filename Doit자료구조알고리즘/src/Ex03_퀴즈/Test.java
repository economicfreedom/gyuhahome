package Ex03_퀴즈;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		
		int[] a = {6,4,3,2,1,9,8};
		int b = 3;
		a[6] = b;
		int x = 0;
		System.out.print("   |");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+-------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.print("   |");
			for (int j = 0; j < a.length; j++) {
				System.out.print("   |");
				if (a[j]==b) {
					x=j;
					break;
				}
			}
		}
		System.out.println("\n그 값은 x["+x+"]에 있습니다.");
	}
}
