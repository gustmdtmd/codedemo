package codetest;

import java.util.Scanner;

public class Code67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] array1 = new int[sc.nextInt()][sc.nextInt()];
		int[][] array2 = new int[array1.length][array1[0].length];
		int[][] arrSum = new int[array1.length][array1[0].length];
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[0].length; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<arrSum.length; i++) {
			for(int j=0; j<arrSum[0].length; j++) {
				arrSum[i][j] = array1[i][j] + array2[i][j];
				System.out.printf("%d ", arrSum[i][j]);
			}
			System.out.println();
			
		}
		
		
		

	}

}
