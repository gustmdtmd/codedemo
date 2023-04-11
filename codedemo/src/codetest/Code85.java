package codetest;

import java.util.Scanner;

public class Code85 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] data = new int[3][2];
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[0].length; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		
		int x = data[0][0] == data[1][0] ? data[2][0] : data[0][0] == data[2][0] ? data[1][0] : data[0][0];
		int y = data[0][1] == data[1][1] ? data[2][1] : data[0][1] == data[2][1] ? data[1][1] : data[0][1];
		
		System.out.printf("%d %d\n", x, y);
	}

}
