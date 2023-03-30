package 연습장.멀까;
import java.util.Scanner;
public class 백준10430번 {

	public static void main(String[] args) {
		
		Scanner 백준 = new Scanner(System.in);
		int A = 백준.nextInt();
		int B = 백준.nextInt();
		int C = 백준.nextInt();
		
		백준.close();
		
		System.out.println((A+B)%C); 
		System.out.println((A%C+B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		
	
		

		
	}

}
