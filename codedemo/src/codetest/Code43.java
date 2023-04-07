package codetest;

import java.util.Scanner;

public class Code43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] basket = new int[N];
		int[][] s = new int[M][3];
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				s[i][j] = sc.nextInt();
			}
			for(int k=s[i][0]-1; k<s[i][1]; k++) {
				basket[k] = s[i][2];
			}
		}
		
		for(int i=0; i<basket.length; i++)
			System.out.println(basket[i]);

	}

}
