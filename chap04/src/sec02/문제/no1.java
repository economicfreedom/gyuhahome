package sec02.문제;

public class no1 {

	public static void main(String[] args) {
		for(int 자살횟수=1; 자살횟수<=100; 자살횟수++ ) {
			if(자살횟수%3 !=0) {
				continue;
			}
			System.out.println(자살횟수);
		}
	}
}