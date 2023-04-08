package codetest;

import java.util.Scanner;

public class Code61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String data = sc.next();
		int cnt = 1;

		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) != data.charAt(data.length() - 1 - i)) {
				cnt = 0;
			}
		}

		System.out.println(cnt);

	}

}
