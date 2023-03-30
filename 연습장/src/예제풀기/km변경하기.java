package 예제풀기;
import java.util.*;
public class km변경하기 {

	public static void main(String[] args) {
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		System.out.println("미터(m)를 입력하세요");
		//integer.parseInt(scan.nextLine());으로 i에 받는 숫자형으로 받은 문자열로 변환
		int i = Integer.parseInt(scan.nextLine());
		// km인 k변수 선언 
		int k = 0;
		//만약 1000이 보다 크다면 if 문을 실행 해서 i+"m"를 출력 그렇지 않다면 else로 넘어감
		if(i<1000) {
			System.out.println(i+"m");
		}else //엘즈 문으로 넘어와서 k에 i 나누기 1000을 한 값을 대입 ex 내가 2000을 읍력하고 i/1000를 했을경우 i 2000이 되어서 몫2 즉 2km로가 출력됨
			{k=i/1000;
		System.out.println(k+"km");
		}
		
		
	}

}
