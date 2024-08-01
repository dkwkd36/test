package com.home;
import java.util.*;
public class Gugudan {

	public static void main(String[] args) {
		int i,j,k,num;
	    Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");

		num = sc.nextInt();

		for(i=1;i<9;i+=num){

			for(j=1;j<=9; j++){

				for (k=1;k<=num;k++){

					if(i+k<=9)

					System.out.print((i+k)+" * "+j+" = "+((i+k)*j)+"\t\t");

				}

				System.out.println();

			}
			System.out.println();
		}

	}

}
