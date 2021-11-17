package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum= 0;
		int tsum= 0;
		
		for(int a= 1; a<=10; a++ ) {
			sum= sum+a;    //sum= sum+a
			System.out.println(a+" 까지의 합은 "+sum);
			
			if(a==10) {
				tsum= sum;
			}
			
		}
		System.out.println("1부터 10까지의 정수의 합은 "+tsum+" 입니다.");
	}

}
