package sec03.exam02;

import sec03.exam02.*;

public class EnumLoginExample {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인에 성공했습니다.");
		} else if(result == LoginResult.FAIL_ID){
			System.out.println("ID가 틀렸습니다.");
		} else {
			System.out.println("패스워드가 틀렸습니다.");
		}

	}
}
