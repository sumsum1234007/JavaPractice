package com.yedam.valuable;

public class JavaVariable {
	public static void main(String[] args) {
		//v1 변수 생성 후 15의 값을 초기화(=데이터 입력)
		int v1 = 15;
		
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2;
		int v4;
		v1 = v1 + v4; //v4는 초기화가 안 되었을 때의 오류
		//v2 오류. 중괄호의 종속 관계 때문
	}
	//v1 = 10; //v1도 같은 이유로 오류
}
