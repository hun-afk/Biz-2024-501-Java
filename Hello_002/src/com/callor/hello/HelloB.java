package com.callor.hello;
/*
 * 1~100까지 숫자가 짝수인지 홀수인지 판별하여 출력
 * 		1 : 홀수
 * 		2 : 짝수
 * 		3 : 홀수
 */
public class HelloB {
	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			int num = i + 1;
			if(num % 2 == 1) {
				System.out.println(num + " : " + "홀수");
			} else {
				System.out.println(num + " : " + "짝수");
			}
		}
	}
}
