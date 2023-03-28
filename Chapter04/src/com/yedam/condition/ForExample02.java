package com.yedam.condition;

public class ForExample02 {

	public static void main(String[] args) {
		/* // 중첩반복문
		// 2단 ~ 9 단 구구단 출력
		// i가 멈춰있는 상태에서 j가 몇 번 반복하는지
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (j*i));
			}
		}		
		
		// 공포의 별 찍기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 안 for문: 별 찍어주는 역할
		// 밖 for문: 줄바꿈 역할
		
		// *   첫번째 줄 1개
		// **  두번째 줄 2개
		// *** 3줄 3개
		// ****
		// *****
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ***** 1줄 5개 - > 5줄 5개(i랑 j가 값이 같다)
		// ****  2줄 4개 - > 4줄 4개
		// ***   3줄 3개
		// **
		// *
		
		*/
		
		// 하는 법 1
		for(int i=0; i<5; i++) {
			for(int j=5; 5-i>=0; j--) {
				System.out.print("*");
		}
			System.out.println();
		}
		
		// 하는 법 2
		for(int i=5; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
		}
			System.out.println();
		}
		
		/* 
		1) 회원관리시스템(헬스장, 수영장)
		 -로그인, 회원등록 필수
		 -회원 수정, 회원 삭제, 회원조회(전체회원조회, 특정회원조회 목록), 수강신청
		2) 도서대출 관리시스템(당근마켓, 장터)
		 -로그인, 회원 등록 필수
		 -도서등록, 도서수정, 전체조회, 개별조회, 도서대출, 도서반납
		3) 은행업무 (돈 빌려주고 받고)
		4) 렌트카 대여
		5) 커뮤니티 게시판(console에) ex. 직장인 점심 게시판, 미스터트롯 게시판, 이직, 면접
		- 로그인, 회원 등록 필수
		- 공지사항, 주제별 게시판, 익명게시판, 댓글 기능
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
