package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		
		//no = sc.nextInt();
		//sc.nextLine();
		//array[i] = Integer.parseInt(sc.nextLine());
		
		int[] array = {10, 50, 70, 20, 30, 80, 40};
		// 최대값과 인덱스 구하기
		
		int max = array[0];
		int maxIndex = 0;
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max =array[i];
				maxIndex = i;
			}
		}
		System.out.println(max + "과" + maxIndex);
		
		//반복문이 다 끝나면 최대값이 인덱스에 다 포함되어 있겠지
		
		
		
		
		
		
		
	}

}
