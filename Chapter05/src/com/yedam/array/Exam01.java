package com.yedam.array;

public class Exam01 {

	public static void main(String[] args) {
		// 배열 선언
		//1번째 방식: 데이터가 6개 들어갈 수 있는 공간을 만들고, 1~6사이의 데이터를 넣어주는 형태
		//int[] intarray = {1,2,3,4,5,6};
		
		// 2번째 방식: new 연산자를 활용해서 배열 만드는 형태
		/*int[] intarray = new int[6];
		intarray[0] = 1;
		intarray[1] = 2;
		intarray[2] = 3;*/ 
		
		//문자열을 10개의 공간에 입력하는 배열
		String[] strArry = new String[10];
		
		int[] intArry2;
		// intArry2 = {1,2,3,4,5}; (X)
		intArry2 = new int[5]; //(O)
		
		int[] scores = {83,90,87};
		
		System.out.println("scores 첫번째 값 :" + scores[0]);
		//index 0에 있는 값 가져온다고 생각하자
		System.out.println("scores 첫번째 값 :" + scores[2]);
		
		//반복문을 활용한 배열 사용
		// 총합 구할것
		int sum=0;
		
		for(int i=0; i<3; i++) {
			System.out.println(scores[i] + " - i 값 : " + i);
			sum = sum+ scores[i];
		}
		System.out.println("총 합계 : " +sum);
		
		//new 연산자를 활용해서 배열 생성
		// 1)
		int[] point;
		point = new int[] {83,90,87};
		
		// (2)
		int[] arr1 = new int[3]; //값 즉 데이터가 없는 배열
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		arr1[0] = 10; //나중에 배열 데이터 대입
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		arr3[0] = "3월";
		arr3[1] = "4월";
		arr3[2] = "5월";
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"] : " + arr3[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
