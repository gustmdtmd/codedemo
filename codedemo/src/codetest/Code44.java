package codetest;

import java.util.Scanner;

public class Code44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] basket = new int[N];
		int[][] C = new int[M][2];
		
		for(int i=0; i<basket.length; i++) {
			basket[i] = i+1;
		}
		
		for(int i=0; i<C.length; i++) {
			for(int j=0; j<C[i].length; j++) {
				C[i][j] = sc.nextInt();
			}
			int temp = basket[C[i][0]-1];
			basket[C[i][0]-1] = basket[C[i][1]-1];
			basket[C[i][1]-1] = temp;
		}
		
		for(int i=0; i<basket.length; i++) {
			System.out.println(basket[i]);
		}

	}

}
