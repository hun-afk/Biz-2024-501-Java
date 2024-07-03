package com.callor.hello;

/*
 * main method()를 선언하고
 * 정수 30과 40을 변수에 저장하고
 * 1. 정수 30과 40을 덧셈하고
 * 2. 정수 30과 1의 결과를 뺄셈하고
 * 3. 정수 40과 2의 결과를 곱셈하고
 * 4. 덧셈한 결과와 뺄셈한 결과를 나눗셈
 */
public class HelloF {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		
		int sum = num1 + num2;
		int sub = 30 - sum;
		int multi = 40 * sub;
		int divi = sum / sub;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(divi);
	}
}
