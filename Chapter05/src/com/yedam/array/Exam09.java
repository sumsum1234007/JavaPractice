package com.yedam.array;

public class Exam09 {

	public static void main(String[] args) {
		//int[][] intAry = {{1,2},{1,2,3}};
		// 꽉 차 있지 않는 부분은 데이터로 표현할 수 없음
		
		// { {1,2,3,} , {1,2,3} }
		int[][] mathScore= new int[2][3];
		
		//mathScore.length는 2(밖 데이터 의미)
		for(int i=0; i<mathScore.length; i++) {
			System.out.println("mathScore의 길이: " + mathScore.length);
			for(int j=0; j<mathScore[i].length; j++) {
				System.out.println("mathScore["+i+"]["+j+"]");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
