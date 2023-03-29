package com.yedam.array;

public class Exam10 {

	public static void main(String[] args) {
		// //참조 배열 - 데이터는 같은데 주소가 같은지 안 같은지 보는 작업
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		//윗 문장과 같이 만들어져야 참조타입에서 쓸 수 있다
		
		System.out.println(strArray[1] == strArray[2]); // 안에 들어있는 주소 같을 떄
		System.out.println(strArray[0] == strArray[1]); // 안에 들어있는 주소가 같을 때
		System.out.println(strArray[0].equals(strArray[2])); // 안에 들어있는 값이 같을 때
		
		//배열 복사
		
		  int[] oldArray = {1,2,3};
		  
		  int[] newArray = new int[5];
		  
		  for(int i=0; i<oldArray.length; i++) { newArray[i] = oldArray[i]; }
		  
		  for(int i=0; i<newArray.length; i++) { System.out.println(newArray[i]); }
		  
		  
			
		  // 더 편한 배열 복사 방식 
		  int[] oldArray2 = {1,2,3,4,5,6,7,8}; 
		  int[] newArray2 = new
		  int[10];
		  
		  // oldarray2의 길이만큼! // 원본 , 복사될 배열, 몇 번째 위치에서부터 복사, 이 위치에서 몇 개나 복사
		  System.arraycopy(oldArray2, 0, newArray2, 0, oldArray2.length);
		  
		  System.out.println("--------------------"); for(int i=0; newArray2.length>i;
		  i++) { System.out.println(newArray2[i]); }
		  
		  // 향상된 for문 System.out.println(); // temp와 newArray2의 데이터 타입이 같아야만 가져올 수 있다
		  for(int temp : newArray2) { System.out.println(temp+"\t"); }
			 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
