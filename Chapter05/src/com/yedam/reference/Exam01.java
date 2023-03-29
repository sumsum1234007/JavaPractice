package com.yedam.reference;

public class Exam01 {

	public static void main(String[] args) {
		// stack 영역에 intVal가 생성되어 10 이라는 데이터가 저장됨.
		int intVal = 10;
		
		// 참조타입 : 살고 있는 공간이 달라지면 다른 데이터가 되어버림
		// Stack 영역에 array가 생성(참조:[I@182decdb)되고 다음과 같은 주소가 저장
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		// 연결되어 있는 메모리 영역이 없음
		
		System.out.println(array);
		System.out.println(array2);
		// 데이터가 같지만 데이터가 저장된 공간은 다르다.
		System.out.println(array == array2);
		// 이 때 ==이 무엇을 의미하는지 알아야
		System.out.println(array3.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
