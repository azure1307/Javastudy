package test0329;

/*
* 회사의 직원(Employee)은 여러 유형으로 나뉜다
* 모든 직원은 직원구분, 이름, 주소, 소속부서를 가진다.
* 1. 정규직원(FormalEmployee) : 직원번호,직급, 연봉을 가진다.
*             급여는 연봉 /12
* 2. 비정규직원(InformalEmployee) : 계약 만료일(Date),기본임금을 가진다.
*             급여는 기본임금을 지급한다
* 3. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
*             급여는 시간당 임금 * 근무시간으로 지급한다.
* 모든직원은 급여를 받아야 한다 .
* Employee 클래스는 급여 계산을 할 수 없으므로  
* Employee 클래스의 getPay() 메서드는 추상 메서드로 구현한다.  
* 각각의 클래스에 getPay() 메서드를 구현하기
* 모든 직원들은 자신의 멤버변수의 내용을 입력받아 객체로 생성한다.
* 
* [결과]
정규직=>박정규:4166666
비정규직=>유비정:1000000
임시직=>손임시:250000
전체 직원 급여합:5416666
*/

import java.util.Date;

abstract class Employee {
	String type, name, address, dept;
	Employee(String type,String name,String address,String dept) {
		this.type = type;
		this.name = name;
		this.address= address;
		this.dept = dept;
	}
	abstract long getPay();
	public String toString() {
		return type+":이름="+name+", 주소="+address+",부서="+dept;
	}
}

class FormalEmployee extends Employee {
	String empNo, position;
	long salary;
//	emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
	FormalEmployee(String name,String address,String dept,String empNo,String position,long salary) {
		super("정규직",name,address,dept); //부모클래스의 멤버 초기화
		//내 멤버 초기화
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}
	@Override
	long getPay() {
		return salary / 12;
	}
	@Override
	public String toString() {
		return super.toString()+",직원번호="+empNo+",직급="+position+",연봉="+salary;
	}
}

class InformalEmployee extends Employee {
	Date expireDate;
	long primaryPay;
//	emps[1] = new InformalEmployee("유비정","서울","기획부",exDate,1000000);
	InformalEmployee (String name,String address,String dept,Date expireDate,long primaryPay) {
		super("비정규직",name,address,dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	@Override
	long getPay() {
		return primaryPay;
	}
	@Override
	public String toString() {
		return super.toString()+",계약만료일="+expireDate+",기본임금="+primaryPay;
	}
}

//3. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
//                         급여는 시간당 임금 * 근무시간으로 지급한다.

class TempEmployee extends Employee {
	long timepay;
	int emptime;
//	emps[2] = new TempEmployee("손임시","서울","영업부",25000,10);
	TempEmployee(String name,String address,String dept,long timepay,int emptime) {
		super("임시직",name,address,dept);
		this.timepay = timepay;
		this.emptime = emptime;
	}
	long getPay() {
		return timepay*emptime;
	}
}

public class Test4 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
		Date exDate = new Date(); //오늘 날짜
		exDate.setTime(exDate.getTime() 
				+ (1000L*60*60*24*365));
//		System.out.println(exDate);
		emps[1] = new InformalEmployee("유비정","서울","기획부",exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부",25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":" + e.getPay());
			total += e.getPay();
		}				
		System.out.println("전체 직원 급여합:" + total);
		System.out.println("git test 333");
	}
}
