package ch041701;

public class SmartTvExam {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		//두번째 인터페이스
		Search sch = new SmartTelevision();
		sch.searchable("https://www.youtube.com");
	}

}
