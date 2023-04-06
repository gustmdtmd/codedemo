package codetest;

import java.util.Scanner;

public class Code33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N/4; i++) {
			System.out.printf("%s ", "long");
		}
		System.out.println("int");

	}

}
