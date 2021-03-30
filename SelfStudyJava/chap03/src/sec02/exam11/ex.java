package sec02.exam11;

import java.util.Scanner;

public class ex {

	public static void main(String[] args){
		int score = 85;
		
		String result = !(score>90) ? "가" : "나";
		System.out.println(result);
}
}