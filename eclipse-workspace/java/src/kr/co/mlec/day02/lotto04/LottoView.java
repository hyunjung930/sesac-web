package kr.co.mlec.day02.lotto04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoView {

	public void start() {
		
		int[] lottoNums = new int[6];
		
		System.out.println("< 로또 -4 >");
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
		
		Set<Integer> lottoSet = new HashSet<>();
		
		while(lottoSet.size() != 6) {
			int num = r.nextInt(45)+1;
			lottoSet.add(num);
		}
		
		
		Object[] lottos = lottoSet.toArray();
		for(int i = 0; i < lottos.length; i++) {
			lottoNums[i] = (int)lottos[i];
		}
		
		/*
		 // 해석도 하지 말것!!!! 도움안됨...
//		Integer[] arr = new Integer[6];
//		lottoSet.toArray(arr);
		Integer[] arr = lottoSet.toArray(new Integer[6]);
		System.out.println(Arrays.toString(arr));
		
		lottoNums = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
		
		 */
		
		return lottoNums;
	}
}
















