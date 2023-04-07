package codetest;

import java.util.Scanner;

public class Code47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int num = sc.nextInt();
		
		for(int i=0; i<word.length(); i++) {
			if(i == num-1)
				System.out.println(word.charAt(i));
		}
	}

}
