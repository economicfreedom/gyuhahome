package sec04.예제;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService MemberService =new MemberService();
		boolean result =MemberService.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			MemberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
