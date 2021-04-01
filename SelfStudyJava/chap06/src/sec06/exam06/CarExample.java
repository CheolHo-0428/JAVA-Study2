package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		int speed = myCar.getSpeed();
		
		for(int i=speed; i>=0; i-=10) {
			System.out.println("현재속도: " + i + "km/h");
		}
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(!myCar.isStop());
		
		
		System.out.println("현재속도: " + myCar.getSpeed() + "km/h");
		
		
		
		
		
	}

}
