package 연습장.멀까;
import java.util.Scanner;
public class 백준9498번 {

	public static void main(String[] args) {
		
		Scanner 뿌앵 = new Scanner(System.in);
		int 시험점수 = 뿌앵.nextInt();
		뿌앵.close();
		
		if(시험점수 >=90)System.out.println("A");
		else if(시험점수 >=80)System.out.println("B");
		else if(시험점수 >=70)System.out.println("C");
		else if(시험점수 >=60)System.out.println("D");
		else if(시험점수 <=59)System.out.println("F");
		
		
		

	}

}
