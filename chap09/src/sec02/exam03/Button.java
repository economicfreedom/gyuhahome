package sec02.exam03;

public class Button {
	static interface OnClickListener{
		Void OnClick();
		
	}
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.OnClick();
		
		
		}
}
