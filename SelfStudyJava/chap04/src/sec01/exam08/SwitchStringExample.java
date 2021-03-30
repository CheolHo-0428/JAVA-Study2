package sec01.exam08;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("직급을 입력하세요: ");
		String position = scanner.nextLine();
		
		switch(position) {
			case "부장" :
				System.out.println("월급은 700만원");break;
			case "과장" :
				System.out.println("월급은 500만원");break;
			default :
				System.out.println("월급은 300만원");
		}
	}
}
