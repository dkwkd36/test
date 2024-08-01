package com.exam;

public class Ex04 {

	public static void main(String[] args) {
		int cnt_i = 4;
		int cnt_j = 5;
		int [][] arr = new int[cnt_i][cnt_j];
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1) + (j * cnt_i);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
