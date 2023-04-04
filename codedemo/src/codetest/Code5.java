package codetest;

import java.util.Scanner;

public class Code5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		int max = sc.nextInt();
		int min = max;
		
		for(int i=1; i<a.length; i++) {
			a[i] = sc.nextInt();
			if(max < a[i])
				max = a[i];
			
			if(min > a[i])
				min = a[i];
		}
		
		System.out.printf("%d %d\n", min, max);
	}
}
