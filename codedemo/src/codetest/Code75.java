package codetest;

import java.util.Scanner;

public class Code75 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		int day =  (v - b) / (a - b);
		
		if((v - b) % (a - b) != 0) {
			day++;
		}
		
		System.out.println(day);

	}

}
