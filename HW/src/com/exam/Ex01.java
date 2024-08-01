package com.exam;

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		int a, b, tmp, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		a = sc.nextInt();
		System.out.print("두번째 수 : ");
		b = sc.nextInt();
		
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for (int i = a; i <=b; i++) {
			sum += i;
		}
		
		System.out.printf("%d에서 %d 사이의 합계는 %d입니다", a, b, sum);

	}

}
