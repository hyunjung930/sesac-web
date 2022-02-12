package kr.co.mlec.day02.lotto03;

import java.util.Arrays;
import java.util.Random;

public class LottoView {

	public void start() {
		
		int[] lottoNums = new int[6];
		
		System.out.println("< 로또 -3 >");
		for(int game = 1; game <= 10; game++) {
			lottoNums = getLotto();
			System.out.println(game + "게임 : " + Arrays.toString(lottoNums));
			
		}
	}
	
	/**
	 * 1 ~ 45사이의 중복되지 않는 로또번호 6개를 추출하여 int배열로 전달하는 기능
	 * @return  6개로또번호를 가진 int배열 
	 */
	public int[] getLotto() {
		
		int[] lottoNums = new int[6];
		Random r = new Random();
		
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
		}
		
		for(int i = 0; i < 6; i++) {
			int random = r.nextInt(45-i);
			lottoNums[i] = nums[random] ;
			
			// nums[random]   nums[45-i-1]   swap(스위치)    i=0 => [44]  i=1 => [43]
			int temp = nums[random];
			nums[random] = nums[45-i-1];
			nums[45-i-1] = temp;
		}
		
		return lottoNums;
	}
}
















