package com.home;

public class Ex05 {

	public static void main(String[] args) {

	

		int cnt = 4; 
		int[][] arr = new int[cnt][]; 
		int num = 1;


		for (int i = 0; i < arr.length; i++) {
	
			arr[i] = new int[cnt - i];

			
			for (int j = 0; j < arr[i].length; j++) {

				
				arr[i][j] = num++;
			}

		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
