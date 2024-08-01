package com.exam;

import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		int money;
		int unit[] = {50000, 10000, 1000, 500,100,50,10,1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요");
		money = sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0) {
				System.out.printf("%d원: %d개 \n", unit[i], money/unit[i]);
			}
			money = money % unit[i];
		}
	}

}
