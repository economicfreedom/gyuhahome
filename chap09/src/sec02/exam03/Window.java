package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public Void OnClick() {
			System.out.println("전화를 겁니다.");
			return null;
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public Void OnClick() {
				System.out.println("메세지를 보냅니다.");
				return null;
			}
		});
		}
	}


