package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(6);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState == true) {
			System.out.println("출발합니다.");
			myCar.run();			
			}
		
		boolean gasState1 = myCar.isLeftGas();
		if(gasState1 == true) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}
}
