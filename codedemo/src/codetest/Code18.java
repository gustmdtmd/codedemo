package codetest;

import java.util.Scanner;

public class Code18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int min = sc.nextInt();
		int max = sc.nextInt();
		int hap = 0;
		int m = 0;
		for (int i = min; i <= max; i++) {
			for (int j = 1; j <= 100; j++) {
				if (i == j * j) {
					if (hap == 0) {
						m += i;
					}
					hap += i;
				}
			}
		}
		if (hap == 0) {
			System.out.println(-1);
		} else {
			System.out.println(hap);
			System.out.println(m);
		}
	}
}
