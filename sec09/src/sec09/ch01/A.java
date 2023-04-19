package sec09.ch01;

public class A {
	/*인스턴스 맴버 클래스
	*
	* public class B{} → 다른 패키지에서 b클래스 사용 가능
	* class B{}  →  같은 패키지 안에서만 사용 가능
	* private class B{} → a클래스 내부에서만 사용하겠음 (일반적으로 private 선언 많이 함)
	*/
	class B{
		//필드
		int field1 = 1;
		
		//정적필드
		static int field2 = 2;
		
		//B의 생성자
		B(){
			System.out.println("B-생성자 실행");
		}
	
	
//	//인스턴스 필드값으로 B객체 대입
//	B field  = new B();
	
//	//A 생성자
//	A(){
//		B b = new B();
//	}
	
	//인스턴스 메소드
	void method1() {
//		B b = new B(); //이 메소드 안에서만 사용 가능
		System.out.println("B-메소드 실행");
		
	}
	
	//정적 메소드
	static void method2() {
		System.out.println("B-메소드2 실행");
	}
	}
	
	//인스턴스 메소드
	void useB() {
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		}
	
	
	public void useB2() {
		System.out.println(B.field2);
		B.method2();
	}
	


}
