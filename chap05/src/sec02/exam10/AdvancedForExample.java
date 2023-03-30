package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] 점수1= {95,71,84,93,87};
		
		int 암거나 = 0;
		for(int 점수:점수1) {
			암거나 += 점수;
			
		}
		System.out.println("점수 총합="+암거나);
		
		double avg=(double)암거나/점수1.length;
		System.out.println("점수 평균="+avg);
	}

}
