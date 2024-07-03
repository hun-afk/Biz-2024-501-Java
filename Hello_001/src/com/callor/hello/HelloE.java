package com.callor.hello;
/*
 * main() method를 선언하고
 * 정수형 숫자 30과 40을 변수에 저장한 후
 * 사칙연산 결과를 출력하시오
 */
public class HelloE {
	public static void main(String[] args) {
	
		int num1 = 30;
		int num2 = 40;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int multi = num1 * num2;
		int dibi = num1 / num2;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println((float)dibi);
	}
}
