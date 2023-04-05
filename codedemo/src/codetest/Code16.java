package codetest;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = -1; int maxRow=0; int maxCol=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
				if(max < arr[i][j]) {
					max = arr[i][j];
					maxRow = i+1;
					maxCol = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(max==0 ? "1 1" : maxRow + " " + maxCol );
		
		
		
	}

}
