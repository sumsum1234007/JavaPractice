package com.yedam.array;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		// 배열의 크기
		Scanner sc = new Scanner(System.in);
		
		int[] ary;
		int no;
		
		ary = new int[10];
		System.out.println(ary.length);
		
		System.out.println("배열의 크기 입력>");
		no = sc.nextInt();
		
		//입력 받은 값을 배열의 크기로 사용
		//내가 원하는 배열의 크기(방)으로 맞춤하는 방법 
		ary = new int[no];
		
		System.out.println("배열의 크기 :" +ary.length);
		//배열의 크기를 10으로 설정했다고 가정했을 때
		//배열.length를 활용해서 배열의 크기만큼 반복문을 실행
		for(int i=0; i<ary.length; i++) {
			System.out.println("입력>");
			
			ary[i] = sc.nextInt();
			// i=0일때, ary[0] = 입력한 데이터
			// i=1일때, ary[1[ = 입력한 데이터
		}
		
		for(int i=0; i<ary.length; i++) {
			System.out.println("ary["+i+"] : " + ary[i]);
		}
		
		
		
		
		
		

	}

}
