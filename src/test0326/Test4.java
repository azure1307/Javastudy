package test0326;
//toString 메서드: 객체의 문자열화
/*
2.  다음 결과가 출력되도록 동물클래스와 구동클래스(Test4)를 구현하기       

 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: void eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/
class Animal {
	String name;
	int age;
	void eat() {
		System.out.println("맛있게 얌얌");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "원숭이";
		a1.age = 20;
		
		System.out.println("이름(name):"+a1.name);
		System.out.println("나이(age):"+a1.age);
		a1.eat();
	}
}
