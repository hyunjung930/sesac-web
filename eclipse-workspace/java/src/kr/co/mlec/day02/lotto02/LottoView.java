package kr.co.mlec.day02.lotto02;

import java.util.Arrays;
import java.util.Random;

public class LottoView {

	public void start() {
		
		int[] lottoNums = new int[6];
		
		System.out.println("< 로또 -2 >");
		for(int game = 1; game <= 1; game++) {
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
		boolean[] flag = new boolean[46]; // 0 ~ 45
		
		// 방법2
		for(int i = 0; i < lottoNums.length;) {
			int num = r.nextInt(45) + 1;
			
			if(flag[num] == false) {
				lottoNums[i] = num;
				flag[num] = true;
				i++;
			}
		
		}
		
		/*
		// 방법1
		for(int i = 0; i < lottoNums.length; i++) {
			int num = r.nextInt(45) + 1;
			
			if(flag[num] == false) {
				lottoNums[i] = num;
				flag[num] = true;
			} else {
				i--;
			}
		
		}
		*/
		
		return lottoNums;
	}
}
















