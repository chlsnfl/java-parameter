package ch041701;

public class ServiceExam {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언, 구현 객체 대입
		Service sc = new ServiceImpl();
		
		//디폴드 메소드 호출
		sc.defaultMethod1();
		System.out.println();
		sc.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}

}
