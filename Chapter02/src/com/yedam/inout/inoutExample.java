package com.yedam.inout;

import java.io.IOException;
import java.util.Scanner; //Java에 utility에 있는 scanner의 기능을 빌려쓰겠다

public class inoutExample {

	public static void main(String[] args) throws Exception {
		int value = 123;
		String name = "상품";
		double price = 1000.10;
		
		System.out.printf("상품의 가격 : %d\n", value);
		System.out.printf("%s의 가격 : %d\n", name, value);
		
		System.out.printf("%s의 가격 : %d, %f\n", name, value, price);
		
		// [1)정수 사용]
		value = 11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);
		
		// [2) 실수사용]
		price = 321.4567;  //나한테 생긴 오류: price가 아니라 value로 설정했었음. price가 실수값이기 때문에 price로 해주던지 f를 모두 d로 바꿔서 실수형으로 바꿔야함
		System.out.printf("%f\n", price);
		System.out.printf("%10.2f\n", price);
		System.out.printf("%-10.2f\n", price);
		System.out.printf("%010.2f\n", price);
		
		// [3) 문자열 사용]
		System.out.printf("%s\n", "문자사용");
		System.out.printf("%6s\n", "문자사용");
		System.out.printf("%-6s\n", "문자사용");
		
		// 기본 출력물
		System.out.println("아무것도 없는 print\n"); 
	
		/* 입력 ++++++++얘들은 파쇄. 안 쓴다.
		int keyCode;
		System.out.println("원하는 값 입력 >");
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		System.out.println("원하는 값 입력 >");
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		System.out.println("원하는 값 입력 >");
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode); */
		
		
		// [Scanner]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("데이터 입력>");
		
		String word = sc.nextLine(); //nextline은 엔터키 직전에 있는 문자열 데이터를 가져온다
		
		System.out.println(word);
		
		
		// String.equals() - 문자열 비교
		// 문자열은 기본 타입이 아니기 때문에 == 못 쓰고 equals써서 해줘야
		if(word.equals("test")) {
			System.out.println("equal : 입력하신 문자열과 비교 문자열 같음");
		}
		if(word == "text") {
			System.out.println("== : 입력하신 문자열과 비교 문자열이 같음");
		}
		
	}

}
