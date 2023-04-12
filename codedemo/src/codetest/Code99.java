package codetest;

import java.util.Scanner;

public class Code99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();
		int x= 0, y = 0;
		
		for(int i=-999; i<1000; i++) {
			for(int j=-999; j<1000; j++) {
				if((a*i+b*j==c) && (d*i+e*j==f)) {
					x = i;
					y = j;
					break;
				}
			}
		}
		System.out.printf("%d %d\n", x, y);
		
	}

}
