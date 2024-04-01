package test0329;

abstract class Robot {
	abstract void action();
}

class DanceRobot extends Robot {
	void action() {
		System.out.println("춤을 춥니다");
	}
}

class SingRobot extends Robot {
	void action() {
		System.out.println("노래를 부릅니다");
	}
}

class DrawRobot extends Robot {
	void action() {
		System.out.println("그림을 그립니다");
	}
}
/*
 *
 * Robot 클래스 구현하기
   - 추상클래스로 구현한다.
   - 추상메서드 : action()
   
   Robot 클래스의 하위 클래스
   	DanceRobot인 경우, action()을 호출하면 "춤을 춤니다" 출력
 	SingRobot인 경우, action()을 호출하면 "노래를 부릅니다" 출력
 	DrawRobot인 경우, action()을 호출하면 "그림을 그립니다" 출력
[결과]
춤을 춥니다
노래를 부릅니다
그림을 그립니다 	
 */
public class Test2 {
	public static void main(String[] args) {
		Robot[] bots = new Robot[3];
		bots[0] = new DanceRobot();
		bots[1] = new SingRobot();
		bots[2] = new DrawRobot();
		for(Robot r : bots) {
			r.action();
		}
	}
}
