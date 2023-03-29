package com.yedam.array;

import java.util.*;
public class Exam03 {

	public static void main(String[] args) {
		// 한 학생의 국어, 영어, 수학 점수를 배열에 담아서 성적관리
		
		// {국어, 영어, 수학} 이렇게 된다는 가정 하에
		Scanner sc = new Scanner(System.in);
		
		int[] point = new int[3];
		int sum = 0;
		double avg = 0;
		
		//학생의 성적 입력(console창에서 입력할 수 있도록)
		// i=0일때, ary[0] = 입력한 데이터
		//국어
		point[0] = sc.nextInt();
		//영어
		//수학
		
		// i대신 point[0] = sc.nextInt();도 가능
		
		//학생의 점수 총 합계
		for(int i=0; i<point.length; i++) {
			System.out.println("성적 입력>");
			point[i] = sc.nextInt();
			sum += point[i];
		}
		System.out.println(sum);
		
		//학생의 성적 평균
		avg = sum / point.length;
		// 평균 3으로 하는 거 아니라
		System.out.println((double)avg);
		
		
		
		
		
	}

}
