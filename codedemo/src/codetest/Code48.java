package codetest;

import java.util.Scanner;

public class Code48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] word = new String[num];
		for(int i=0; i<num; i++) {
			word[i] = sc.next();
		}
		
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i].charAt(0)+""+word[i].charAt(word[i].length()-1));
		}

	}

}
