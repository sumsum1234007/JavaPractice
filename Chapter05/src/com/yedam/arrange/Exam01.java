package com.yedam.arrange;

import java.util.Calendar;

public class Exam01 {

	public static void main(String[] args) {
		week today = null;
		
		//요일을 숫자로 가져오는 방식 -> 캘린더를 숫자로 바꿈
		Calendar cal = Calendar.getInstance();
		int weeks = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자 1을 일요일로 전환하는 프로그램
		switch(weeks) {
		case 1:
			today = week.SUNDAY;
			break;
		case 2:
			today = week.MONDAY;
			break;
		case 3:
			today = week.TUESDAY;
			break;
		case 4:
			today = week.WEDNESDAY;
			break;
		case 5:
			today = week.THURSDAY;
			break;
		case 6:
			today = week.FRIDAY;
			break;
		case 7:
			today = week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 :" + weeks);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
