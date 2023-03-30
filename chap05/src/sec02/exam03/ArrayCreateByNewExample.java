package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] 규하1 = new int[3];
		for(int s=0; s<3; s++) {
			System.out.println("규하1["+s+"]:"+규하1[s]);
		}
		규하1[0]=10;
		규하1[1]=20;
		규하1[2]=30;
		for(int s=0; s<3; s++) {
			System.out.println("규하1["+s+"]:"+규하1[s]);
		}
		double[] 규하2 = new double[3];
		for(int e=0; e>3; e++) {
			System.out.println("규하2["+e+"]:"+규하2[e]);
		}
		규하2[0]=0.1;
		규하2[1]=0.2;
		규하2[2]=0.3;
		for(int e=0; e<3; e++) {
			System.out.println("규하2["+e+"]:"+규하2[e]);
		}
		String[] 규하3=new String[3];
		for(int x=0; x<3; x++) {
			System.out.println("규하3["+x+"]:"+규하3[x]);
		}
		규하3[0]="1월";
		규하3[1]="2월";
		규하3[2]="3월";
		for(int x=0; x<3; x++) {
			System.out.println("규하3["+x+"]:"+규하3[x]);
			
		}
				
	}

}
