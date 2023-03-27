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
		
		// 예시) 실수타입을 정수타입으로 강제변환
		double doubleValue = 3.14;
		int intValue = (int) doubleValue;
		
		iVar = (int)dVar; //66.0을 int로 표현
		System.out.println(iVar);
		charVal = (char)iVar;
		System.out.println(charVal);
		System.out.println();
		
		double dVar2 = 3.14444444;
		int iVar2 = (int)dVar2; //3
		System.out.println(iVar2);
	}
}
