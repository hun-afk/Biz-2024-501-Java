package com.callor.hello;
/*
 * 정수형 배열 100개를 선언하고,
 * i ~ 100 Random 수를 생성하여 배열 100개에 할당하기
 */
public class HelloI {
	public static void main(String[] args) {
		int[] num = new int[100];
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(1 + Math.random()*100);
		}
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i] + " ");
			
		}
	}
}
