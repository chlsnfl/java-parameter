package sec09.ch03;

public class A {
	
	//A의 필드와 메소드
	String field = "A-field";
	void method() {
		System.out.println("A-method");
	}
	
	class B{
		//B의 필드와 메소드
		String field = "B-field";  //A와 변수명이 같지만 얘는 이 클래스에만 쓰여서 ㄱㅊ
		void method() {
			System.out.println("B-method");
		}
		void print() {
			//B객체 필드 메소드 사용
			System.out.println(this.field);
			this.method();
			
			//A객체 필드 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	//A인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}

}
