package ch041701;

public interface Service {
	default void defaultMethod1() {
		System.out.println("defaultMethod 종속 코드");
		defaultCommon();
		
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod1 중복 코드 A");
		System.out.println("defaultMethod1 중복 코드 B");
	}
	
	static void staticMethod1() {
		System.out.println("정적메소드1 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("정적메소드1 종속코드");
		staticCommon();
	}
	
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("정적메소드 중복 코드 A");
		System.out.println("정적메소드 중복 코드 B");
	}
	
}
