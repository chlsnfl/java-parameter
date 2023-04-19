package sec09.ch03;

public class A_ {
	//필드
	int field1;
	//메도스
	void method1() {}
	
	//정적 필드
	static int field2;
	//정적 메소드
	static void method2() {}
	
	//인스턴스 맴버 클래스
	class B{	
		void method() {
		//A의 인스턴스 필드 메소드 사용
			field1 = 10;
			method1();
			
		//A의 정적 필드 메소드 사용
			field2 = 10;
		}
	}
}

