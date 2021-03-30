package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int i = (int)(Math.random()*6)+1;
			System.out.println(i);
			if(i == 6) {
				break;	
			}
		}
		System.out.println("프로그램 종료");
	}

}
