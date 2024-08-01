package com.home;

import java.util.*;
import java.io.*;
public class CalendarEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 //사용자의 입력을 받을 스캐너 객체 선언 및 생성
	      Scanner sc = new Scanner(System.in);
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      //출력할 년도와 달을 입력받을 변수를 선언 및 0으로 초기화 한다.
	      int year = 0, month = 0;
	      //총 일수를 담을 변수를 선언 및 0으로 초기화한다.
	      //int totalDay = 0;
	      int end = 0;
	      boolean bool = false;//  윤년 여부 판정 --> true이면 윤년
	      int pos = 0;
	      //해당 달의 날짜를 받을 변수를 선언 및 0으로 초기화 한다.
	      int start= 0;
	      //해당 달의 시작 날짜를 받을 변수를 선언 및 0로 초기화한다.(2006년 1월 1일은 일요일)
	     int base = 2006;
	      //년도와 달을 입력하라는 출력 문구 및 생성한 Scanner객체를 통해 year,month 변수에 값을 입력한다.
	     
	     
	     do {
	      System.out.print("년도 입력 : ");
	   //   year = sc.nextInt();
	      year = Integer.parseInt(br.readLine());
	      }while(year < 0 || year > 9999);
	      do {
	      System.out.print("월 입력 : ");
	     // month = sc.nextInt();
	      month = Integer.parseInt(br.readLine());
	      } while(month < 1 || month > 12);
	      
	   // 윤년과 평년 판별
		   // 입력받은 년도를 이용하여 윤년인지를 판정함
		   if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
			   bool = true;// 이 조건이 만족하면 윤년으로 판정함
		   }
	      
	   
	      switch(month) {
		   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			   end = 31;// 각 월의 마지막 날짜가 31일 경우
		   break;
		   case 4: case 6: case 9: case 11: 
			   end =30;// 각 월의 마지막 날짜가 30일 경우
		   case 2:
			   if(bool)
				   end=29;// 2월의 날짜가 29일로 끝나면 윤년
			   else 
				   end = 28;// 2월의 날짜가 28일로 끝나면 평년
		   }
		   
		   if(year < base) {
			   start = base - year;
			   for(int i = year; i <base; i++) 
				   if(i % 4 ==0 && i % 100 != 0 || i % 400 == 0)
					   start++;
			   start = 7 - start % 7;
			   if(start == 7)
				   start = 0;
		   }
		   else {
			
			   start = year - base;//2024-2006
			   for(int i = base; i < year; i++) 
				   if(i % 4 ==0 && i % 100 != 0 || i % 400 == 0)
					   start++;
			   start %= 7;
		   }
		   
		   for(int i = 1; i < month; ++i) {
			   switch(i) {
			   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				   start +=31;
			   break;
			   case 4: case 6: case 9: case 11: 
				   start +=30;break;
			   case 2:
				   if(bool)
					   start +=29;
				   else 
					   start +=28;
			   }
		   }
		   start %= 7;
	      // --------------------------------------------------------------

		   System.out.println();
		   System.out.println("======================");
		   if(year < 10) System.out.print("000");
			else if(year < 100) System.out.print("00");
			else if(year < 1000) System.out.print("0");
		  
			System.out.print("====== "+year + "년 ");
			if(month < 10) System.out.print("0");
			System.out.println(month + "월  ========");
			 System.out.println("======================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i = 0; i < start; i++, pos++) System.out.print("\t");
			for(int i = 1; i <= end; i++) {
				if(i < 10) System.out.print(' ');
				System.out.print(i);
				pos++;
				if(pos % 7 == 0) System.out.println();
				else System.out.print("\t");
			}
			if(pos % 7 != 0) System.out.println();
			System.out.println("======================");
	         
	}
}