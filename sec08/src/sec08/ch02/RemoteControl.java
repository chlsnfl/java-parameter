package sec08.ch02;

public interface RemoteControl {

	//상수 static final 필드
	int MAX_VDLUME = 10;
	int MIN_VOLUME = 0;
	
	//default 추상 메소드 - 실행영역 없이 메소드의 선언부만 작성
	void turnOn();
	void turnOff();
	void setVolumn(int volumn);
}
