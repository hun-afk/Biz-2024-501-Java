package com.callor.hello;
/*
 * prime(int num) method 를 생성하고
 * 매개변수로 전달받은 num의 값이 소수인지 판별하여
 * 결과를 return하기
 */
public class HelloE {
	public static Boolean prime(int num) {
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		int num = 1031;
		for(int i = 2; i<num; i++) {
			if(num % i== 0) {
				System.out.println(num+"은 소수가 아님");
				break;
			} else {
				System.out.println(num+"은 소수");
			}
		}
	}
}