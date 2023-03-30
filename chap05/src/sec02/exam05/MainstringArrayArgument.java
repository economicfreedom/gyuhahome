package sec02.exam05;

public class MainstringArrayArgument {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.err.println("값의 수가 부족합니다.");
			 System.exit(0);
		}
		
		String 규하1 = args[0];
		String 규하2 = args[1];
		
		int 레오1 = Integer.parseInt(규하1);
		int 레오2 = Integer.parseInt(규하2);
		
		int result = 레오1+레오2;
		System.out.println(레오1+"+"+레오2+"="+result);
	}

}
