package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		int sum= 0;
		
		while(true) {
			int num= sc.nextInt();
			sum= sum+num;
			System.out.println("합계: "+sum);
			
			if(num==0) {
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}
}
