package codetest;

import java.util.Scanner;

public class Code84 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = Math.abs(arr[0]-arr[2]) > arr[0] ? arr[0] : Math.abs(arr[0]-arr[2]);
		int b = Math.abs(arr[1]-arr[3]) > arr[1] ? arr[1] : Math.abs(arr[1]-arr[3]);
		int c = a>b?b:a;
		System.out.println(c);
	}

}
