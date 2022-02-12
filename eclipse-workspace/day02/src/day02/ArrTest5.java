package day02;

import java.util.Scanner;

public class ArrTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 10, 20, 30, 50, 100 };
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		System.out.println("=======");
//
//		for (int index : arr) {
//			System.out.println(index);
//		}

       /*
        *   이름을 5개 배열로 입력하시오..
        * 
        * 
        */
	
		Scanner sc=new Scanner(System.in);
		String[] name=new String[5];
		
		for(int i=0; i<name.length; i++)
		{
			 System.out.println("input name");
			 name[i]=sc.nextLine();
			
		}
		
		
		for(String item :name)
			System.out.println(item);
		
		
	
	
	
	
	
	}

}
