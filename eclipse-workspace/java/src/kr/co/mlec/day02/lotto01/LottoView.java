package kr.co.mlec.day02.lotto01;

import java.util.Arrays;
import java.util.Random;

public class LottoView {

	public void start() {
		
		int[] lottoNums = new int[6];
		System.out.println("< 로또 -1 >");
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
		
		for(int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = r.nextInt(45) + 1; // 0+1 ~ 44+1
			for(int j = 0; j <= i-1; j++) {
				if(lottoNums[i] == lottoNums[j]) {
					i--;
					break;
				}
			}
		}
		
		return lottoNums;
	}
}
















