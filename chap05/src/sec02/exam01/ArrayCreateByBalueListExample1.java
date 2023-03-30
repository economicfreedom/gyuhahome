package sec02.exam01;

public class ArrayCreateByBalueListExample1 {

	public static void main(String[] args) {
		int[] 점수 = {74,69,98}; 
		
		System.out.println("점수[0]:"+점수[0]);
		System.out.println("점수[1]:"+점수[1]);
		System.out.println("점수[2]:"+점수[2]);
		
		int 암거나 = 0;
		for(int g=0; g<3; g++) {
			암거나 += 점수[g];
		}
		System.out.println("합:"+암거나);
		double sex = (double)암거나/3;
		System.out.println("평균:"+sex);

	}

}
