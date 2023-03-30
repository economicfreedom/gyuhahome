package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] 낡은어레이= {1,2,3};
		int[] 새로운어레이 = new int[5];
		
		for(int g=0; g<낡은어레이.length; g++) {
			새로운어레이[g] = 낡은어레이[g];
		}
		for(int g=0; g<새로운어레이.length; g++) {
		    System.out.println(새로운어레이[g]+",");
		}
	}
		
}
