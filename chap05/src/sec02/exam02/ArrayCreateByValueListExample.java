package sec02.exam02;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] 점수1;
		점수1 = new int[] {96,56,45};
		int 암거나1 = 0;
		for(int g=0; g<3; g++) {
			암거나1 += 점수1[g];	
		}
		System.out.println("총합:"+암거나1);
		
		int 암거나2 = add(new int[] {96,56,45});
		System.out.println("총합:"+암거나2);
		System.out.println();
	}
	public static int add(int[] 점수1) {
		int 암거나1 = 0;
		for(int g=0; g<3; g++) {
		암거나1 += 점수1[g];
		}
		return 암거나1;
	}
}

