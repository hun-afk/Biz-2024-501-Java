package com.callor.hello;

/*
 * 2~100까지 범위의 Random 수 1개를 만들고
 * 그 수가 prime인지 아닌지 판단
 */
public class HelloK {
	public static void main(String[] args) {
		int nums = (int) (Math.random() * 99) + 2;
		for (int i = 2; i < nums / 2; i++) {
			if (nums % i == 0) {
				break;
			}
			if(i < nums) {
				System.out.println(nums + "는 소수가 아님");
			} else {
				System.out.println(nums + "는 소수");
			}
		}
	}
}