package 연습장.멀까;
import java.util.Scanner;
public class 백준3003번 {

	public static void main(String[] args) {
		int BKing = 1;
		int BQuune = 1;
		int BRook = 2;
		int BBishop = 2;
		int BNights = 2;
		int BPawn = 8;
		Scanner 체스말 = new Scanner(System.in);
		
		int WKing = 체스말.nextInt();
		int WQuune = 체스말.nextInt();
		int WRook = 체스말.nextInt();
		int WBishop = 체스말.nextInt();
		int WNights = 체스말.nextInt();
		int WPawn = 체스말.nextInt();
		
		체스말.close();
		
		System.out.println(BKing-WKing);
		System.out.println(BQuune-WQuune);
		System.out.println(BRook-WRook);
		System.out.println(BBishop-WBishop);
		System.out.println(BNights-WNights);
		System.out.println(BPawn-WPawn);
	}

}
