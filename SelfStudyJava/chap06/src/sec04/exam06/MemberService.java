package sec04.exam06;

public class MemberService {
	
	public boolean login(String id, String password) {
		if(id.equals("홍길동") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	public void logout(String id) {
		System.out.println(id+"님 로그아웃 되었습니다.");
	}
}
