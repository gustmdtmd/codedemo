package codetest;

import java.util.Scanner;

public class Code51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		char[] alpa = 
				new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] num = new int[26];
		for(int i=0; i<26; i++) {
			for(int j=0; j<word.length(); j++) {
				if(alpa[i]==word.charAt(j)) {
					num[i] = j; break;
				}else {
					num[i] = -1;
				}
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.println(num[i]);
		}

	}

}
