package 연습장.멀까;
import java.util.Scanner;
public class 백준2739번 {

	public static void main(String[] args) {
		
		Scanner hi = new Scanner(System.in);

		int N = hi.nextInt();
		
		hi.close();
		
		for(int i=1; i<=9; i++) {
			 System.out.println(N+"*"+i+"="+(N*i));	
		 }
		
		}
	}