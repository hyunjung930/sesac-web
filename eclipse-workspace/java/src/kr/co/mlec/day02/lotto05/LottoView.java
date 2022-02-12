package kr.co.mlec.day02.lotto05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoView {

	public void start() {
		
		int[] lottoNums = new int[6];
		
		System.out.println("< 로또 -5 >");
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

		List<Integer> lottos = new ArrayList<>();
		for(int i = 0; i < 45; i++) {
			lottos.add(i+1);
		}
		
		//System.out.println(Arrays.toString(lottos.toArray()));
		Collections.shuffle(lottos);
		//System.out.println(Arrays.toString(lottos.toArray()));
		
		for(int i = 0; i < lottoNums.length; i++) {
//			lottoNums[i] = lottos.get(i);
			lottoNums[i] = lottos.remove(0);
		}
		
		
		return lottoNums;
	}
}
















