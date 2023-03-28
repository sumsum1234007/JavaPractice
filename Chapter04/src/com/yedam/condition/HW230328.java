package com.yedam.condition;

public class HW230328 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);

		// 문제1) 각 연산식을 대입 연산자 하나로 구성된 연산식으로 수정하세요.
		int val = 0;

		int val1 = val + 10; //10
			
		int val2 = val - 5; //-5
		
		int val3 = val * 3; // 3
				
		int val4 = val / 5; //0
		
		int result = val1 + val2 + val3 + val4;
				System.out.println(result);
		
		
		// 문제2) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		int intResult = ((val>0) ? val : 0);
				System.out.println(intResult);
		
		/* 문제 3) 다음과 같이 두 개의 정수가 주어졌을 경우 
	  			    두 정 수 중에서 음수가 있다면 'One of a or b is negative number'를,
	  			    만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요. */ 
		int a = 10;
		int b = -8;
		if (a<0 || b<0) {
			System.out.println("One of a or b is negative number");
		} else {
			System.out.println("both a and b are zero or more");
		}
		//String strResult;
		//System.out.println(strResult);

		// 문제4) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		/* int n = 1
				
		for(i>0; i++) {
			System.out.println("제" + n"분면");
		} */

		// 문제5) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		int leap = 0;
		if ((leap/4 == 0 && leap/100 !=0) || leap/400 ==0) {
			System.out.println("윤년입니다");
		}
		
		// 문제6) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		
		/*이기는 경우(3가지 경우)
		바위 보
		가위 보 "이기기 위해선 바위를 내야합니다."
		보 가위
		
		int hand = sc.nextInt();
		
		switch(hand) {
		case ("가위"):
			System.out.println("이기기 위해선 바위를 내야합니다");
			break;
		}*/

		// 문제7) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		
		for(int m=2; m<=9; m++) {
			for(int n=1; n<=9; n++) {
				System.out.println(m + " X " + n +" = " + (m*n));
			}
		}
		//문제 8)
		//	구구단 출력
		// 	첨부파일 확인 후 해당 그림과 같이 구현해 볼 것.
		//	파일명 : gugu.png
		for(int k=2; k<=5; k++) {
			for(int o=1; o<=9; o++) {
				System.out.println(k + " X " + o +" = " + (k*o));
			}
		}

	}

}
