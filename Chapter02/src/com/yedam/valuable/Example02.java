package com.yedam.valuable;

public class Example02 {
	public static void main(String[] args) {
		// [자동 타입 변환]
		char charVal = 'A'+1; // A 다음 값이 B기 때문에. A=65
		System.out.println(charVal);
		int iVar = charVal;  //int를 만나는 순간 숫자로 변환
		System.out.println(iVar); //66
		double dVar = iVar;
		System.out.println(dVar); //double 만나는 순간 실수로 변환
		
		
		// [강제 타입 변환]
		// 100에 300을 넣는다면 나머지 200은 증발
		
		// int intValue = 10;
		// byte bytevalue = (byte) intValue;
		// int를 byte형으로 바꿔줄 때 저렇게 위처럼 괄호 안에 표현
			
		iVar = (int)dVar; //66.0을 int로 표현
		System.out.println(iVar);
		charVal = (char)iVar;
		System.out.println(charVal);
		System.out.println();
		
		double dVar2 = 3.14444444; // 예시) 실수타입을 정수타입으로 강제변환
		int iVar2 = (int)dVar2; //3
		System.out.println(iVar2);
		
		
		// [자동 타입 변환을 활용한 연산]
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
		//byte result2 = x+y; //결과값이 int라 result2에 못 넣음
		// int result2 = x+y; 자동변환방식
		// byte result2 = (byte)(x+y); 강제변환방식
		
		//데이터 타입 크기에 따른 연산
		// long + int = long
		// byte + int = int
		// double + int = double
		
		byte bVar = 10;
		int iVar1 = 100;
		long lvar = 1000;
		long result3 = bVar + iVar1 + lvar;
		System.out.println(result3);
		
		// 정수 연산의 결과가 정수만 나올 때
		int iVal2 = 1;
		double dVal3 = iVal2 / 2; //결과값이 0이 아니라 0.5 얻고 싶으면 ival2앞에 (double)입력
		System.out.println(dVal3);
		
		//String을 Int로 변환(문자열을 기본 타입으로 강제 변환)
	}
}
