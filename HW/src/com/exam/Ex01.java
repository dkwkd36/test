package com.exam;

import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		int a, b, tmp, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		a = sc.nextInt();
		System.out.print("�ι�° �� : ");
		b = sc.nextInt();
		
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for (int i = a; i <=b; i++) {
			sum += i;
		}
		
		System.out.printf("%d���� %d ������ �հ�� %d�Դϴ�", a, b, sum);

	}

}
