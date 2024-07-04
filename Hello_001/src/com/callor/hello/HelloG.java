package com.callor.hello;

/*
 * main() method를 만들고
 * 정수 1 ~ 10까지 숫자를 Console 에 출력하기
 * 
 * 
 */
public class HelloG {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
		System.out.println("=".repeat(30));
		/*
		 * 1 ~ 10까지 정수를 1 ~ 10까지 가로방향으로 출력
		 */

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1);
			if (i + 1 < 10) {
				System.out.print(",");
			}
		}
		System.out.println("\n" + "=".repeat(30)); // \n으로 줄바꿔서 =로 줄긋기
		/*
		 * 1~100까지 숫자를 1 2 3처럼 빈칸으로 구분하여 출력 단, 5개마다 줄바꾸기
		 */
		for (int i = 0; i < 100; i++) {
			System.out.print((i + 1) + " ");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}