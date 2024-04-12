package test0411;

/*
 * 생산자 스레드, 소비자 스레드 문제
 * CarMarket 클래스 : 자동차 판매소
 *    멤버 변수 : String carName;
 *    멤버메서드 :
 *       String getCar() : 임의의 자동차를 선택 리턴 {"소나타","K9","그랜저","산타페"}
 *       synchronized String push() : carName변수에 저장 기능
 *       							  공급하는거니까 Producer만 할거임
 *       synchronized String pop() : carName변수값을 null로 변경
 *       							  빼는거니까 Seller만 할거임

 *  Seller 클래스 : 판매원. Thread 클래스 상속
 *     멤버메서드 : run()
 *         carName에 객체가 존재하면 pop 메서드 호출하기.
 *         carName에 객체가 없으면 wait() // 객체가 있어야 팔 수 있음
 *         0 ~ 2000밀리초를 임의로 sleep()
 *  Producer 클래스 : 자동차 공급자. Thread 클래스 상속       
 *     멤버메서드 : run()
 *         push() 메서드 호출하여 carName에 객체를 저장함.
 *         carName 객체가 존재하면 wait() 함. // 객체가 없어야 공급할 수 있음
 *         0 ~ 5000밀리초를 임의로 sleep()
 */
 /* [결과]
    1:Producer=>산타페생산함
    1:Seller=>산타페판매함
    2:Producer=>벤츠생산함
    2:Seller=>벤츠판매함
    3:Producer=>그랜저생산함
    3:Seller=>그랜저판매함
    4:Producer=>K9생산함
    4:Seller=>K9판매함
    5:Producer=>벤츠생산함
    5:Seller=>벤츠판매함
    6:Producer=>벤츠생산함
    6:Seller=>벤츠판매함
    7:Producer=>소나타생산함
    7:Seller=>소나타판매함
    8:Producer=>산타페생산함
    8:Seller=>산타페판매함
    9:Producer=>BMW생산함
    9:Seller=>BMW판매함
    10:Producer=>소나타생산함
    10:Seller=>소나타판매함
    11:Producer=>벤츠생산함
    11:Seller=>벤츠판매함
    12:Producer=>K7생산함
    12:Seller=>K7판매함
    13:Producer=>K9생산함
    13:Seller=>K9판매함
    14:Producer=>K7생산함
    14:Seller=>K7판매함
    15:Producer=>벤츠생산함
    15:Seller=>벤츠판매함
    16:Producer=>K7생산함
    16:Seller=>K7판매함
    17:Producer=>소나타생산함
    17:Seller=>소나타판매함
    18:Producer=>K9생산함
    18:Seller=>K9판매함
    19:Producer=>그랜저생산함
    19:Seller=>그랜저판매함
    20:Producer=>벤츠생산함
    20:Seller=>벤츠판매함
*/
class CarMarket {
	String carName;
	String getCar() {
		String[] cars = {"소나타","K9","그랜저","산타페","티볼리","BMW","벤츠"};
		return cars[(int)(Math.random()*cars.length)];
	}
	synchronized String push(int i) {
		// 차 공급해야되는데 차가 있음 -> 기다림
		while(carName != null) { // push() 호출안됨
			try {
				wait(); // 현재 실행중인 스레드를 wait 상태로 바꿈. 동기화영역에서만 호출가능
			} catch(InterruptedException e) {}
		}
		// 차가 없음
		notifyAll(); // 현재 wait() 상태인 모든 스레드를 Runnable 상태로 변경. 동기화영역에서만 호출가능
		carName = getCar(); // 공급
		System.out.println(i+":"+Thread.currentThread().getName() + "=>" + carName + "생산함");
		return carName;
	}
	synchronized String pop(int i) {
		// 차 팔아야되는데 차가 없음 -> 기다림
		while(carName == null) { // pop() 호출안됨
			try {
				wait(); // 현재 실행중인 스레드를 wait 상태로 바꿈. 동기화영역에서만 호출가능
			} catch(InterruptedException e) {}
		}
		// 차가 있음
		notifyAll(); // 현재 wait() 상태인 모든 스레드를 Runnable 상태로 변경. 동기화영역에서만 호출가능
		String result = carName; // 판매
		System.out.println(i+":"+Thread.currentThread().getName() + "=>" + carName + "판매함");
		carName = null;
		return result;
	}
}
class Seller extends Thread { // 소비자 스레드
	CarMarket cm;
	Seller(CarMarket cm) {
		super("Seller");
		this.cm = cm;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			cm.pop(i+1);
			try {
				sleep((int)(Math.random() * 2000)); // 최대 2초까지 대기
			} catch (InterruptedException e) {}
		}
	}
}
class Producer extends Thread { // 생산자 스레드
	CarMarket cm;
	Producer(CarMarket cm) {
		super("Producer");
		this.cm = cm;
	}
	public void run() {
		for(int i=0;i<20;i++) {
			cm.push(i+1);
			try {
				sleep((int)(Math.random() * 5000)); // 최대 5초까지 대기
			} catch (InterruptedException e) {}
		}
	}
}
public class Test3 {
	public static void main(String[] args) {
		CarMarket cm = new CarMarket(); // 공유객체
		Thread s = new Seller(cm);
		Thread p = new Producer(cm);
		s.start(); p.start(); 
	}
}
