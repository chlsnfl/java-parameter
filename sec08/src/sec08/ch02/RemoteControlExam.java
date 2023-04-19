package sec08.ch02;

public class RemoteControlExam {
	
	public static void main(String[] args) {
		
//		RemoteControl rc = new Television();
		
		System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VDLUME);
		System.out.println("리보면 최소 볼륨 : " + RemoteControl.MIN_VOLUME );
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolumn(10);
		rc.turnOff();
	}

}
