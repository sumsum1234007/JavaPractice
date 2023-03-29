package com.yedam.array;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		// 배열 크기 설정
		scores = new int[studentNum];
				
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생 수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				
							
				/*
				 * } else if (selectNo ==2) { for(int i=0; i<scores.length; i++) { scores[i] =
				 * Integer.parseInt((scanner.nextLine()); System.out.println(scores[i]); }
				 * 
				 * 
				 * 
				 * } else if (selectNo ==3) { System.out.println(scores[i]);
				 */
				
			} else if (selectNo ==4) {
				// 최고점수
				int max = scores[0];
				
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
					max = scores[i]; }
				}
				System.out.println(max);
				
				//평균점수 (구하려면 합계 필요)
				int sum=0;
				
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
				}
				System.out.println(sum);
				
				double avg=0;
			    avg = sum / scores.length;
				System.out.println(avg);
			    		
			} else if (selectNo ==5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
