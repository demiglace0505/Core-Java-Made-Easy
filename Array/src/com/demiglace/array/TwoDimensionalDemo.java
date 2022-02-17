package com.demiglace.array;

public class TwoDimensionalDemo {	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(matrix[1][2]);
		System.out.println("---");
		
		//column
		for(int i=0; i<3 ; i++) {
			//row
			for (int j=0;j<3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
