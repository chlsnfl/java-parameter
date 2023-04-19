package test;

public class Test {
	//구현 과정 : id와 pw 를 private로 줌
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	//매개변수에 id와 pw가 들어가도록 만들어줌
	public boolean login(String id, String pw) {
		if(id.equals("ezen") && pw.equals("12345")) {
			System.out.println("로그인 되었습니다.");
			return true;
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
			return false;
		}
	}
	
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
	

}
