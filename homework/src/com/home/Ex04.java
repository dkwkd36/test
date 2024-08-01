package com.home;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt_i = 4;	//諛곗뿴�쓽 �뻾 �겕湲�
		int cnt_j = 5;	//諛곗뿴�쓽 �뿴 �겕湲�
		int[][] arr = new int[cnt_i][cnt_j];	//2李⑥썝 諛곗뿴 �꽑�뼵
		
		//�뻾異쒕젰
		for(int i = 0; i < arr.length;i++){
				
			//�뿴異쒕젰
			for(int j = 0; j < arr[i].length; j++){
				
				arr[i][j] = ( i + 1 ) + (cnt_i*j);
			}
					
		}
						
		//異쒕젰
		for(int i = 0; i < arr.length;i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
