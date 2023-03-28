package com.yedam.condition;

import java.util.Scanner;

public class WhileExample01 {

	public static void main(String[] args) {
		// 1~100 사이에서 2의 배수만 출력
		int i =1;
		while(i<=100) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
		
		int menuNo = 0;
		Scanner sc = new Scanner(System.in);
		
		while(menuNo != 4) {
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("메뉴선택>");
			// 1~4
			menuNo = sc.nextInt();
			switch(menuNo) {
			case 1:
				System.out.println("덧셈 실행");
			break;
			case 2:
				System.out.println("뺄셈 실행");
			break;
			case 3:
				System.out.println("곱셈 실행");
			break;
			case 4:
				System.out.println("프로그램 종료");
			break;
			}
		}
		
		// 오락실
		int money; //돈 투입
		int menu = 0;
		System.out.println("====Insert Coin====");
		money = sc.nextInt();
		
		// 1) 게임 1회 실행 시 금액 500원 차감

		// 2) 내가 투입한 금액만큼만 반복문을 돌린다. 게임을 할 수 없는 금액이면 반복문 종료
		// 반복문 종료: 3번 눌러서도 종료가 가능하다
		
		// 3) 게임의 기회가 몇 번 남았는지 표시하는 기능
		// ex) 1500원 -> 3번의 기회가 남아있습니다.
		//while(menu != 3) {
		// 2000, 2000/500 4
		// 2000, 0/500 = 0
		// 0번의 기회일 때 더 이상 처리하지 못한다
		
		while(money/500>0) { //남은 몫을 활용
			System.out.println((money/500) + "번의 기회가 있습니다");
			
			System.out.println("1. 가위바위보 | 2. 앞 뒤 맞추기 | 3. 종료");
			System.out.println("입력>");
			menu = sc.nextInt();
			
			if(menu ==1) {
				System.out.println("가위바위보");
				money -= 500; 
			} else if(menu ==2) {
				System.out.println("앞 뒤 맞추기");
				money -= 500;
			} else if(menu ==3) {
				System.out.println("오락실 종료");
				break;
			} else {
				System.out.println("없는 메뉴입니다.");
			}
		  }
		
		
		// Do while 문
		int month;
		do {
			System.out.println("올바른 월을 입력하세요[1-12]");
			month = sc.nextInt();
		}while(month<1 || month>12);
		
		
		
		// break문
		
		// 무한 루프 > 항상 true > 항상 조건 만족 > 반복문이 계속 실행
		while(true) {
			int num = (int)(Math.random()*6)+1;
			if(num ==6) {
				System.out.println("while문 종료");
				break;
			}
		}
		
		// 중첩 for문 안에서의 break;
		// for 반복문이 이렇게 두 개 있을 때 무엇이 종료되느냐?
		// break문이 직접 몸 담고 있는 for문을 종료시킨다. 즉 둘 다 멈추게 하진 못한다.
		for(int j=0; j<=10; j++) {
			for(int k=0; k<=10; k++) {
				if(j+k == 4) {
					System.out.println("j + k =" + (j+k));
					break;
				}
			}
		}
		
		// 중첩 for문 밖에서의 break;
		// 밖에 반복문에다 Outter라는 이름을 부여
		// A~Z까지 스물 몇 번 정도인데
		// Outter: 라벨 붙이는 방법
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
					// Outter없이 break만 쓰면 Z까지 표현됨
				}
			}
		}
		
		// continue문
		// continue를 기준으로 반복문 재 실행
		// 아래 sysout 실행하지 않고 바로 올라가기 때문에 짝수에 대한 건 출력하지 않음
		// 홀수일 때만 출력하고 싶을 때
		for(int j=0; j<=10; j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		

	
	}
}
