package kr.co.mlec.day01.calendar.type1;

import java.util.Calendar;

/**
 * 만년달력과 관련된 클래스
 * @author 홍길동
 *
 */

public class CalendarUtil {

	/**
	 * 파라미터로 출력할 년도를 넘기면 1월 12월까지의 달력이 출력
	 * @param year 출력할 년도
	 */
	public void showByYear(int year) {
		
		for(int month = 1; month <= 12; month++) {
			/*this.*/showByMonth(year, month);
		}
	}
	
	/**
	 * 해당년도, 월 입력 시 달력 출력
	 * @param year 출력할 년도
	 * @param month 출력할 월
	 */
	public void showByMonth(int year, int month) {
		
		System.out.println("<< " + year + "년 " + month + "월 >>");
		
		// 1. 해당월의 1일이 무슨요일????
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		// 2. 해당월의 마지막날이 몇일이야????
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
//		System.out.println("week : " + week);
		
		showByDay(week, lastday);
	}

	/**
	 * 달력을 출력하는 진짜 기능
	 * @param week 요일번호(1-7)
	 * @param lastday 마지막날(28,29,30,31)
	 */
	private void showByDay(int week, int lastday) {
		
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------");
		
		int lineCnt = 0;
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			lineCnt++;
		}
		for(int day = 1; day <= lastday; day++) {
			System.out.print(day + "\t");
			lineCnt++;
			if(lineCnt % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}






