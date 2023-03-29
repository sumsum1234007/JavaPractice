package com.yedam.oop;

public class Application {

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone();
		// s1 객체에 정보 대입
		s1.name = "아이폰";
		s1.maker = "애플";
		s1.price = 12000;
		
		// s1 객체의 메소드 사용
		s1.getInfo();
		
		System.out.println(s1.name);
		System.out.println(s1.maker);
		System.out.println(s1.price);
		
		// s1은 100번지. 객체가 살고있는 주소값
		// 이 스마트폰의 기능과 정보는 s1이 다 사용할 수 있다는 말
		// 점 연산자 활용
		
		SmartPhone s2 = new SmartPhone();
		 
		System.out.println(s2.name); //초깃값이 String이라 null
		System.out.println(s2.maker); // 동일
		System.out.println(s2.price); //초기값이 int라 0으로 출력
		
		
	}

}
