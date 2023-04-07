package codetest;

import java.util.Scanner;

public class Code41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] s = new int[N];
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			if(X>s[i])
				System.out.print(s[i] + " ");
		}
		System.out.println();


	}

}
