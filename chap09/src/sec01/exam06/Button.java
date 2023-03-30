package sec01.exam06;

public class Button {
	OnClickListener listener;
	
	void setListener(OnClickListener listener) {
		this.listener=listener;
		
	}
	
	void click() {
		//클릭안에는 구체적인 클릭의 내용을 넣으면 언됨 버튼을 설계를할떄는 이 클릭안에 구체적인 내용을 넣으면 안됨
		listener.onClick();
	}
	
	static interface OnClickListener{
		//이 인터페이스의 용도는 버튼을 클릭헀을떄 버튼의 실행 내용을 가지고 있는  구현클레스를 얻기위한 인터페이스
		void onClick();
		//언젠가는 사용될 click이라는 메소드안에 사용될 구현객체를 받기위해서 사용됨
		
		
	}
	
}
