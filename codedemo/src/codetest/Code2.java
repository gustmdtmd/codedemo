package codetest;

import java.util.Scanner;

public class Code2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int[] a = new int[T];
		int[] b = new int[T];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			System.out.println(a[i] + b[i]);
		}
	}

}
