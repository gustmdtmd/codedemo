package codetest;

import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] book = new int[10];
		
		for(int i=0; i<book.length; i++) {
			book[i] = sc.nextInt();
		}
		
		int one = book[0];
		
		for(int i=1; i<book.length; i++) {
			one -= book[i];
		}
		
		System.out.println(one);

	}

}
