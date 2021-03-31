package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.keyTrunOn();
		myCar.run();
		System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

	}

}
