package com.callor.hello;

public class HelloG {
	public static void main(String[] args) {
		int idx = 0;
		for(;;) {
			if(idx++ > 99) {
				break;
			}
			System.out.println("Hello korea");
		}
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("Hello Korea");
		}
	}
}
