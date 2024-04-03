package test0401;
/*
 구동 클래스를 실행 했을 때 다음의 결과가 나오도록 
 RemoteControl 인터페이스 완성하기
 
 [결과]
TV를 켭니다.
Tv의 볼륨을 10으로 설정합니다.
TV를 끕니다.
Audio를 켭니다.
Audio의 볼륨을 20으로 설정합니다.
Audio를 끕니다.
 */
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
}
class Television implements RemoteControl{
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volumn) {
		System.out.println("Tv의 볼륨을 "+volumn+"으로 설정합니다.");
	}
}
class Audio implements RemoteControl{
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volumn) {
		System.out.println("Audio의 볼륨을 "+volumn+"으로 설정합니다.");
	}
}

public class Test2 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn(); 
		rc.setVolume(20); 
		rc.turnOff();
	}
}