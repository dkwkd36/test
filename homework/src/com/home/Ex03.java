package com.home;

public class Ex03 {

	public static void main(String[] args) {
		int cnt_i = 4;	//배열의 행 크기
		int cnt_j = 5;	//배열의 열 크기
		int[][] arr = new int[cnt_i][cnt_j];	//2차원 배열 선언
		
		//행출력
		for(int i = 0; i < arr.length;i++){
				
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				//행의 시작값은 행*열-1 로시작되고 열은 행의 크기 * 열의 인덱스 이다.
				arr[i][j] = (cnt_i * cnt_j - i) - (cnt_i*j);
			}
					
		}
						
		//출력
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
