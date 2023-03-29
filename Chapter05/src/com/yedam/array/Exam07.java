package com.yedam.array;

public class Exam07 {

	public static void main(String[] args) {
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
				// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
				
				//데이터와 인덱스를 연결
				int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 }; //1,2,3,4
				int[] counter = new int[4]; //0,1,2,3
				// counter[0] = answer 1
				// answer[0] =1
				// counter[answer[0]] =counter[1]
				// counter[answer[0]-1] = counter[1-1] = counter[0] = 0
				// counter[answer[0]-1 ++ = counter[0]++
				// 0번째는 1이 등장한 횟수
				
				for (int i = 0; i < answer.length; i++) {
					counter[answer[i]-1]++;
				}
				for (int i = 0; i < counter.length; i++) {
					for(int j=0; j<counter[i]; j++) {
				System.out.println("*");
				}
				
				}
				

	}

}
