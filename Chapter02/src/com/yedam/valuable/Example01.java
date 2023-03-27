package com.yedam.valuable;

public class Example01 {
	public static void main(String[] args) {
		// [int]
		int var1 = 0b1011; //2진수(0b가 붙으면)
		int var2 = 0206; //8진수(0)
		int var3 = 365; //10진수
		int var4 = 0xb3; //16진수(0x)
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		// [byte] 내가 변수에 데이터를 담을 수 있냐 없냐
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		// byte bVal4 = 500; //방향이 127~128까지라 오류
		int bVal4 = 500;
		
		System.out.println(bVal4);
		
		// [long] 정수에서 가장 큰 데이터 타입을 가짐(>int)
		// long 1Val = 10;
		// long 1Val2 = 20;
		// long 1Val3 = 10000000000L;
		
		// 자바의 규칙
		// 정수에서는 기준을 int로 잡혀있기 때문에 L을 쓰는 기준은
		// 기준 int의 데이터 범위를 벗어나서, L을 붙인다.
		
		// [char] (유니코드) : 문자와 문자열로 나뉨
		// 문자: 하나의 문자만 들어가는 경우 (ex. 'A'가능 'AB' 불가능)
		// 문자열: 하나 이상의 문자가 모이는 경우(ex. "apple")
		
		char charVal1 = 'A';
		char charVal2 = '가';
		char charVal3 = 67;
		char charVal4 = 0x0041;
		
		System.out.println(charVal1);
		System.out.println(charVal2);
		System.out.println(charVal3);
		System.out.println(charVal4);
		
		// [문자열](String)
		// char charVal5 = "홍길동"; //문자만 넣을 수 있으니까 안됨. 되려면 한글자만
		String str1 = "홍길동";
		String str2 = "프 로 그 래 머"; //띄워쓰기도 하나의 문자열이라 반영
		
		System.out.println(str1);
		System.out.println(str2);
		
		// [Escape] 탭만큼 띄움
		System.out.println("번호\t이름\t직업");
		// [Enter]
		System.out.println("행 단위 출력\n"); //두번 엔터 친 것 처럼 나옴. ln도 엔터의 느낌
		// 특수문자 사용
		System.out.println("우리는 \"개발자\" 입니다.");
		// 특수문자 사용2
		System.out.println("봄\\여름\\가을\\겨울");
		
		// [실수 타입] float
		float fVal = 3.14f; //float 쓸 때는 무조건 f
		// [실수 타입] double
		double dVal = 3.14;
		// e 사용하기
		double dVal2 = 3e6; // 3 * 10의 6승
		float fVal2 = 3e6f;
		double dVal3 = 2e-3; //2 * 10의 -3승 = 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		// [boolean] 논리타입 = true OR false
		boolean stop = true;
		
		if(stop) { // = if(stop == true) . if자리에 true 데이터가 들어가므로
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
