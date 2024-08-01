package com.concert;

import java.util.Scanner;


class Seat {
    private String name;
    public void set(String name) {this.name=name;}
    public String get() { return name; }
    public void show() {
       if(name == null) System.out.print(" --- ");
       else  System.out.print(" "+ name + " ");
   }
}



public class Concert {
	
	private Seat[][] seats;
	
	private Scanner sc;
	
	public Concert() {
	
		this.seats =new Seat[3][10];
		for (int i = 0; i <seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {				
				seats[i][j] = new Seat();
			}
		}
		sc = new Scanner(System.in);
	}
	
	
	
	public void input() {
		System.out.print("�¼����� S(1), A(2), B(3) => ");
		int rank = sc.nextInt();
		if ( rank == 1) {
			System.out.print("S: ");		
		} else if ( rank == 2) {
			System.out.print("A: ");
		} else {
			System.out.print("B: ");
		}
		for (int i = 0; i < 10 ; i++) {
			seats[rank-1][i].show();
		}
		System.out.println("���� B�� ����");
		System.out.println("    1    2    3    4    5    6    7    8    9    10");	
		
		
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("��ȣ: ");
		int number = sc.nextInt();
		
		seats[rank-1][number-1].set(name);
		
		System.out.println("-------------------����-------------------");
	}
	
	public void view() {
		
		
		
		for (int i = 0; i < seats.length; i++) {
			if (i == 0) {
				System.out.print("S: ");
			} else if (i == 1) {
				System.out.print("A: ");
			} else {
				System.out.print("B: ");
			}
			
			
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j].show();
			}
			System.out.println();
		}
		
		System.out.println(">>>>>>>>>��ȸ�� �Ϸ��Ͽ����ϴ�<<<<<<<<<<");
	}
	
	public void cancle() {
		System.out.print("�¼� S:1, A:2, B:3 >> ");
		int rank = sc.nextInt();
		if ( rank == 1) {
			System.out.print("S: ");
			for (int i = 0; i < 10 ; i++) {
				seats[rank-1][i].show();
			}	
		} else if ( rank == 2) {
			System.out.print("A: ");
			for (int i = 0; i < 10 ; i++) {
				seats[rank-1][i].show();
			}
			
		} else {
			System.out.print("B: ");
			for (int i = 0; i < 10 ; i++) {
				seats[rank-1][i].show();
			}
		}
		
		System.out.println();
		System.out.print("�̸�: ");
		String name = sc.next();
		
		for (int i = 0; i < seats[rank-1].length; i++) {
			if (name.equals(seats[rank-1][i].get())) {
				seats[rank-1][i].set(null);
			}
		}
		
	}
	
	public void finish() {
		System.exit(0);
	}
	
	public void run() {
		System.out.println("���ι� �� �ܼ�Ʈ ���� ���α׷�");
		
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���: 3, ����: 4 -> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: cancle(); break;
			case 4: finish(); break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println();
		
		}
	}
	
	public static void main(String[] args) {
		new Concert().run();
	}

}
