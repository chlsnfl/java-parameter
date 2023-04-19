package ch041701;

public class SmartTelevision implements RemoteControl, Search {

	@Override
	public void searchable(String url) {
		System.out.println(url + " 을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {

	}

}
