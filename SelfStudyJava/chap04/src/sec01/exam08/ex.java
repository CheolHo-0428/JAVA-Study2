package sec01.exam08;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("포인트를 입력하세요: ");
		int score = scanner.nextInt();
		String grade;
		
		if(score<70) {
			grade = "D";
		} else if(score < 80) {
			grade = "C";
		} else if(score < 90) {
			grade = "B";
		} else {
			grade = "A";
		}
		System.out.println("당신은 " + grade +"등급 입니다.");
		
		switch(grade) {
		case "A" : System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case "B" : System.out.println("VIP 혜택을 받으실 수 있습니다.");break;
		case "C" : System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		case "D" : System.out.println("일반 회원 혜택을 받으실 수 있습니다.");break;
		default : System.out.println("혜택이 없습니다.");
		}
		System.out.println("감사합니다.");
	}
		
}


