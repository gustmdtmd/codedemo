package codetest;

import java.util.Scanner;

public class Code71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num != 0) {
			int data = sc.nextInt();
			
			int Q = data/25;
			data = data%25;
			
			int D = data/10;
			data = data%10;
			
			int N = data/5;
			data = data%5;
			
			int P = data/1;
			
			System.out.printf("%d %d %d %d\n", Q, D, N, P);
			num--;
		}

	}
}
