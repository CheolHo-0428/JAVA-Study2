package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("원면적 : " + calc.areaCircle(10));
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(10) );
		

	}

}
