package com.yedam.oop;

public class SmartPhone {
	// 필드 - 객체의 정보를 저장할 수 있는 공간
	// 기본타입, 참조타입
	String name;
	String maker;
	int price;
	
	// 생성자 - 객체가 생성될 때 실행되는 부분
	// 클래스명과 동일한 명을 사용하여 정의
	public SmartPhone() {
		System.out.println("객체가 생성되면서 실행");
	}
	
	// 메소드 - 객체가 생성되고 나서 쓸 수 있는 기능을 정의
	// 핸드폰에 대한 정보를 출력할 수 있는 기능
	// void: 반환값이 없다, return이 존재하지 않는다
	public void getInfo() {
		System.out.println("나는 getInfo의 메소드다.");
	}
	
	// smartphone에 출력한 게 application에 뜨고
	// application에 출력한 게 smartphone에 뜬다
	   
	 
	

}
