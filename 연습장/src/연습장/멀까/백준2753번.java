package 연습장.멀까;
import java.util.Scanner;
public class 백준2753번 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		in.close();
        
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
}



		
		

	