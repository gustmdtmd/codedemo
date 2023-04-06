package codetest;

import java.util.Scanner;

public class Code30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data = sc.nextLine();
		String[] time = data.split(" ");

		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		int a = sc.nextInt();

		if (a + m < 60)
			System.out.println(h + " " + (a + m));
		else {
			int k = (a + m) / 60;
			if (h + k < 24) {
				System.out.println((h + k) + " " + (a + m - 60 * k));
			} else {
				System.out.println((h+k-24) + " " + (a + m - 60 * k));
			}
		}
	}

}
