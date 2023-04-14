package codetest;

import java.util.Scanner;

public class Code121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int cnt = 0;
		String[] see = new String[n];
		String[] listen = new String[m];
		for(int i=0; i<n; i++) {
			see[i] = sc.next();
		}
		
		for(int i=0; i<m; i++) {
			listen[i] = sc.next();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(see[i].equals(listen[j])) {
					cnt++;
				}
			}
		}

	}

}
