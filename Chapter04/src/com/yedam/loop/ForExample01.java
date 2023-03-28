package com.yedam.loop;

public class ForExample01 {

	public static void main(String[] args) {
		//while문: 언제 멈춰야 할지 모를 때 or 사용자가 종료할 때(버튼 누름)
		//ex: 카카오톡 종료
		//for문: 반복할 때(정해져 있는 횟수. 반복횟수 알고 있을 때)
		//ex: 데이터 배열
		//for 문 초기화식: 변수활용 매우 중요
		
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);
		
		//i는 임시변수(for문이 끝나면 i 없어짐)
		for(int i=1; i<=5; i++) {
			sum = sum + i;
		}
		
		
		
		
		
		
	}

}
