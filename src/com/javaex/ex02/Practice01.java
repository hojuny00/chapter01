package com.javaex.ex02;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 :");
		String name= sc.nextLine();
		
		System.out.println("주소를 입력해주세요.");
		System.out.print("주소 :");
		String address= sc.nextLine();
		
		System.out.println("당신은 "+address+"에 사는 "+name+" 입니다.");
		
		
		
		sc.close();
		
		
		
		
	}

}
