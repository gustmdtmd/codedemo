package codetest;

import java.util.Scanner;

public class Code23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String[] s = new String[4];
			int upper = 0;
			int lower = 0;
			int number = 0;
			int jump = 0;
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.next();
				for (int j = 0; j < s[i].length(); j++) {
					if (s[i].charAt(j) >= 'a' && s[i].charAt(j) <= 'z') {
						lower++;
					} else if (s[i].charAt(j) >= 'A' && s[i].charAt(j) <= 'Z') {
						upper++;
					} else if (s[i].charAt(j) >= '0' && s[i].charAt(j) <= '9') {
						number++;
					} else if (s[i].charAt(j) == ' ') {
						jump++;
					}
				}
			}
			System.out.println(lower + " " + upper + " " + number + " " + jump);
			
		}
		sc.close();

	}

}
