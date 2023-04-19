package test;

public class MemberService {

	public static void main(String[] args) {
		Test ts = new Test();
		
		boolean rs =ts.login("ezen", "12345");
		System.out.println(rs); // 정상적으로 로그인 되었다는 문구와 true가 뜸
		
		ts.logout(); // 로그아웃 되었다는 문구가 출력
		
		boolean rs2 = ts.login("test", "111");  // id, pw 오류로 옳바르지 않다는 문구가 출력됨
		System.out.println(rs2); // false 문구 출력
		
		ts.login("test", "12345");  // id, pw 오류로 옳바르지 않다는 문구만 출력됨
	}

}
