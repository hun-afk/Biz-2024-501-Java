package com.callor.hello;

/*
 * 정수형 배열 100개 선언하고
 * 0번 배열 부터 순서대로 1~100까지 정수를 저장하기
 */
public class HelloH {
	public static void main(String[] args) {
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
	}
}