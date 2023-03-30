package sec01.exam06;

public interface RemoteControl {
	//상수 초기값을 입력해야하고 이름은 대문자로 작성 하는 것이 관례이며 서로 다른 단어라면 언더바로 이어줘야함 띄어쓰기 x
		int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		//메소드 
		//아래 코드 같은 격우 public abstract가 생략 되어 있음
		
		void turnOn();
		void turnOff();
		void setVolume(int volume);

}
