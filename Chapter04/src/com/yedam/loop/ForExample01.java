package com.yedam.loop;

import java.util.Scanner;

public class ForExample01 {

	public static void main(String[] args) {
		//들여써지면 insert키 눌러서 해결하기(현상: 왼쪽 공백에 빨간색으로 줄 뜸)
		
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
		
		// 1~100사이의 짝수, 홀수 구하기
		// 짝수의 성격: 2 4 6 8 10...(짝수%2 = 0)
		// 홀수의 성격: (1. if else 써서 짝수가 아닌 애들은 다 홀수)
		           //(2. 홀수%2 ==1)
		/* for(int i=0; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i+ "는 짝수"); */
				
		for(int i=0; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i+ "는 짝수");	
			} else {
				System.out.println(i+ "는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//구구단만 출력 -> 입력 구구단 출력
		// 규칙찾기 -> 2X1 =2, 2X2 =4, 2X3=6...
		/*r(int i=1; i<=9; i++) {
			System.out.println("2 X "+ i + " = " + (2*i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 입력>");
		int gugu = sc.nextInt(); //default 넣는 법?
		
		
		
		for(int i=1; i<=9; i++) {
			System.out.println(gugu + " x " + i + " = " + (gugu*i));
		} */
		
		//입력한 값에 대한 총합, 평균, 최대값, 데이터 받을 개수 스캐너 활용해서 데이터 입력
		//데이터 받을 개수 -> 반복문 횟수
		// 총합: 입력받자마자 총합이라는 변수에 누적 합계
		// 평균: 총합 / 데이터 입력 개수 (이 때, 데이터 입력갯수는 count가 됨)
		// 최대값: 입력한 데이터와 기존에 들어있는 데이터 비교 후 더 큰 것-> 최대값
		// 최소값: 더 작은 것
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg = 0;
		int max =0;
		int min =0;		
		
		//데이터 입력
		System.out.println("데이터 입력 개수>");
		
		// sysout ctrl + space
		//입력할 데이터 갯수 입력 받음
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.println("데이터 입력>");
			int data = sc.nextInt();
			//총합 : total
			total += data;
			// 최대값, 최소값 초기값 설정
			if(i==0) {
				max = data;
				min = data; //비교대상이 처음에 없으니까 이렇게 넣어주는 것
			} else {
				if(max < data) { //max: 가지고 있는 값 data: 입력값
					max = data;
				}
				if(min > data) { //data를 min에 넣어주는 경우
					min = data;
				}
			}
		}
		
		// 반복문 결과 출력
		System.out.println("총합 :" + total);
		System.out.println("평균 :" + (total/(double)count));
		System.out.println("최대값 :" + max + "최소값 : " + min);
		
		// up&down
		//임의 랜덤값(1~100)사이의 하나의 정수를 추출해서
		//5번 기회 안에 해당하는 랜덤 값을 맞추는 프로그램 구현
		 
		//예시) 랜덤값 50
		int randomNo = (int)(Math.random()*100) +1;
		
		//입력값: 30 => up		//입력값: 70 => down
		int i=1;
		
		for (i=1; i<=5; i++) {
			System.out.println("Up & Down>>");
			int count1 = sc.nextInt();
			
		if (count1 == randomNo) {
			System.out.println("정답입니다." + i + "번의 기회만에 맞추셨습니다.");
			break;
		}else if (count1 > randomNo) {
			System.out.println("down");
			}else{
		System.out.println("up");
			}
		
		if (i==4) {
			System.out.println("마지막 기회를 소진하였습니다.");
		}
		if (i>5) { //이 부분은 위에 넣는 게 아니고 아래에 따로
			System.out.println("실패입니다.");
		}
		}
		//정답일 경우
		//=> 정답, 몇 번의 기회만에 맞추셨습니다.
		
		//임의값의 경우: 사용자가 입력한 값
		
		
		
		
	
	
}
}
