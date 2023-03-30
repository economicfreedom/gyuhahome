package sec02.exam07;

public class ArrayReferenceObjectExmple {

	public static void main(String[] args) {
		 String[] 규하애오 = new String[3];
		 규하애오[0] = "자바";
		 규하애오[1] = "자바";
		 규하애오[2] = new String("자바");
		 
		 System.out.println( 규하애오[0]==규하애오[1]);
		 System.out.println( 규하애오[0]==규하애오[2]);
		 System.out.println( 규하애오[0].equals(규하애오[2]));
		 
		 
	}

}
