package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			System.out.println("*** "+ i +"단 ***");
			for(int n=1; n<10; n++) {
				System.out.println(i + " x " + n +" = "+ (i*n));
			}
		}

	}

}
