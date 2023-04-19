package sec08.ch02;

public class Television implements RemoteControl {
	
	//필드
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}
	
	@Override
	public void setVolumn(int volumn) {
		//max_voulumn
		
		if(volumn>RemoteControl.MAX_VDLUME) {
			this.volumn = RemoteControl.MAX_VDLUME;
		}else if(volumn<RemoteControl.MIN_VOLUME) {
			this.volumn = RemoteControl.MIN_VOLUME;
		}else {
			this.volumn = volumn;
		}
		System.out.println("현재 오디오 볼륨 : "+ this.volumn );
	}
}
