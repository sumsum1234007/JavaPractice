package com.yedam.array;
import java.util.*;
public class Exam04 {

	public static void main(String[] args) {
		// 배열에 담긴 최대, 최소값
		Scanner sc = new Scanner(System.in);
		
		int[] ary;
		int no;
		
		System.out.println("배열의 크기>");
		no = sc.nextInt();
		sc.nextLine();
		ary = new int[no];
		
		// 배열에 데이터 입력
		for(int i=0; i<ary.length; i++) {
			System.out.println("데이터 입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
					//문자형을 인트형으로 바꾸는 방식
		
		}
		//최대값 구하기
		int max = ary[0];
		for(int i=0; i<ary.length; i++) {
			if(max < ary[i]) {
				//배열에서 가장 큰 애 꺼내오면 i 입장에서는 그 애가 가장 큰애
			   max = ary[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		//최소값 구하기
		int min=ary[0];
		// ary[i]는 안되는 게 for문 안에서 정의되는 것이라서
		// 첫번째 데이터와 비교하기 시작하는 것이기 때문에
		for(int i=0; i<ary.length; i++) {
			if(min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		
		
		
		
	}

}
