package com.callor.hello;
/*
 * main() method 생성하고
 * 1~100 까지 숫자중 짝수만 출력하기
 */
public class HelloA {
	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			if((i+1) % 2 == 0) {
				System.out.print(i+1 + " ");
			}
		}
	}
}