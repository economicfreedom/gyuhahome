package sec06.exam06;

public class Car {
	//Field
	private int speed;
	private boolean stop;

	//Method
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
		this.speed = speed;	
		}
		
	}
	public boolean isStop() { //boolean 타입일 경우 get,set이 아닌 is로 시작함
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		//if(stop) {
			speed = 0;
		//}
	}
	
	
	
}
