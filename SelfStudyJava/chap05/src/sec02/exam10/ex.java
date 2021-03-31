package sec02.exam10;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int inputNum = Integer.parseInt(scanner.nextLine());
			
			if(inputNum == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(inputNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(inputNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> "+ scores[i]);
				}
			} else if(inputNum == 4) {
				int sum = 0;
				double avg;
				int max = 0;
				
				for(int score : scores) {
					sum+=score;
				}
				
				avg = (double)sum/scores.length;
				
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
		} else {
			System.out.println("프로그램 종료");
			break;
		}
	}
}
}
