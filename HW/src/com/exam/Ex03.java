package com.exam;

import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오. >> ");
		ch = sc.next().charAt(0);
		
		for(char i = ch; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
