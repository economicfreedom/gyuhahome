package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] 메쓰점수 = new int [3][4];
		for(int g=0; g<메쓰점수.length; g++) {
			for(int c=0; c<메쓰점수[g].length; c++) {
				System.out.println("메쓰점수["+g+"]["+c+"]="
									+메쓰점수[g][c]);
						
										
									
				
			}
		}
		System.out.println();
		
		int[][] 한국어점수= new int[2][];
		한국어점수[0] = new int[2];
		한국어점수[1] = new int[3];
		for(int g=0; g<한국어점수.length; g++) {
			for(int c=0; c<한국어점수[g].length; c++) {
				System.out.println("한국어점수["+g+"]["+c+")="
									+한국어점수[g][g]);
			}
		}
		System.out.println();
		
		int[][] 자바점수= { {79,92},{16,27,32} };
		for(int g=0; g<자바점수.length; g++) {
			for(int c=0; g<자바점수[g].length; c++) {
				System.out.println("자바점수["+g+"]["+c+")="
						+자바점수[g][g]);
			}
		}
		
		}

}
