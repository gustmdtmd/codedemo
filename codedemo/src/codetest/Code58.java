package codetest;

import java.util.Scanner;

public class Code58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] res = new int[6];
		int[] data = {1, 1, 2, 2, 2, 8};
		int a = 0;
		
		for(int i=0; i<data.length; i++) {
			a=sc.nextInt();
			res[i] = data[i]-a;
			System.out.print(res[i] +" ");
		}
		System.out.println();
		
	}
}
