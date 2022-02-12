package kr.co.mlec.day01;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateMain {

	
	public static void main(String[] args) {
		
		/*
		// 오늘은 2021년 12월 28일입니다
		Date d = new Date();

		System.out.println(d);
		
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		
		System.out.println("오늘은 " + year + "년 "
				+ month + "월 " + date + "일입니다");
		*/
		
		
		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DATE);
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(day); // 1(일) ~ 7(토)
		
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
			// week[1] 일 ~ week[7] 토
		
		System.out.println("오늘은 " + year + "년 "
				+ month + "월 " + date + "일(" + week[day] +
				")입니다");
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월의 마지막날은 " 
					+ lastday +"일입니다");
		
		
		// 2019년 5월 15일로 날짜 변경 -> 요일????
		c.set(2019, 5-1, 15);
		
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2019년 5월 15일은 " 
				+ week[day] + "요일입니다");
		
		//c.setTime(new Date());
		
		String pattern = "yyyy-MM-dd HH:mm:ss(E)";
		pattern = "오늘은 yyyy년 MM월 dd일 HH시 mm분 ss초 E요일입니다";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		//String str = sdf.format(new Date());
		String str = sdf.format(c.getTime());
		System.out.println(str);
		
		
	}
}








