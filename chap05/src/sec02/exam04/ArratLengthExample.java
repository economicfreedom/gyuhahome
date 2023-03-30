package sec02.exam04;

public class ArratLengthExample {

	public static void main(String[] args) {
		int[] 점수 = {69,74,77};
		
		int 규하 = 0;
		for(int c=0; c<점수.length; c++) {
			규하 += 점수[c];
			
		}
		System.out.println("총합:"+규하);
		double 최 = (double) 규하 / 점수.length;
		System.out.println("평균:"+최);
	}
		
		
		}
		

