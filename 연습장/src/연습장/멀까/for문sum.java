package 연습장.멀까;

public class for문sum {

	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("1~5의 합:"+sum);
		
		int sum5 = 0;
		for (int i=1; i<=100; i++) {
			sum5 = sum5 +i;			
		}
		System.out.println("1~100의 합:"+sum5);
	}

}
