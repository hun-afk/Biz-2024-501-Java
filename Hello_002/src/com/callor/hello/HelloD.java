package com.callor.hello;
/*
 * 1~100까지 정수 중
 * 짝수들의 전체 합을 계산하여 출력
 */
public class HelloD {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 0; i<100; i++) {
			int num = i + 1;
			if(num % 2 == 0) {
				cnt += num;
			}
		}
		System.out.println(cnt);
	}
}
