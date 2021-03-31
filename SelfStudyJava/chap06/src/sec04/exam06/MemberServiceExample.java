package sec04.exam06;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요: ");
		String inputId = scanner.nextLine();
		
		System.out.print("비밀번호를 입력하세요: ");
		String inpudPw = scanner.nextLine();
		
		boolean login = memberService.login(inputId, inpudPw);
		if(login == true) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(inputId);
		} else {
			System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
		}
	}
}
