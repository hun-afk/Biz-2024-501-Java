package com.callor.hello;
/*
 * 10~50범위의 random 정수 1개를 생성하고
 * 생성한 random 수 만큼 정수형 배열을 선언하고
 * 배열의 각 요소에 1~100까지 범위의 random 수를 저장
 * 배열에 저장된 값을 출력
 */
public class HelloJ {
	public static void main(String[] args) {
		int num = (int)(Math.random()*40) + 1;
		int[] nums = new int[num];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*100) + 1;
		}
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n"+"=".repeat(30));
		// 생성된 nums의 요소들 전체를 합산하고, 평균을 계산하여 출력
		
		int sum = 0;
		float avg = 0;
		for(int num1 : nums) {
			sum += num1;
		}
		avg = (float)sum/nums.length;
		
		System.out.printf("배열의 합계 : %d\n", sum);
		System.out.printf("배열의 vudrbs : %2f\n", num);
		
	}
}
