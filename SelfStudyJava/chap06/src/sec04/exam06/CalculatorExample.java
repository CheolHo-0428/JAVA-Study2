package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double areaRectangle1 = myCalc.areaRectangle(10);
		System.out.println("정사각형의 넓이= " + areaRectangle1);
		
		double areaRectangle2 = myCalc.areaRectangle(10, 20);
		System.out.println("직사각형의 넓이= " + areaRectangle2);
	}

}
