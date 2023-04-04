package codetest;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		int d = b - 45 >= 0 ? b - 45 : 60 + (b - 45);
		int c = b > d ? a : (a - 1 >= 0 ? a - 1 : 23);
		
		System.out.printf("%d %d\n", c, d);
	}

}
