package Ex02_퀴즈;
import java.util.*;

public class Q1 {
	static int maxOf(int[] n) {
		int max = n[0];
		
		for (int i = 0; i < n.length; i++) {
			if (n[i]>max) {
				max=n[i];
				
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		int n = rand.nextInt(90);		
		System.out.println("사람 수: "+n);
		
		int[] height = new int[n];
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < n; i++) {
			height[i]= 100+rand.nextInt(90);
			System.out.println("height["+i+"]: "+height[i]);
		}
		
		System.out.println("최대값은"+maxOf(height)+"입니다.");
		
	}
	
}
