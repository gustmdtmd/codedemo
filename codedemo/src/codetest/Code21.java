package codetest;

import java.util.Scanner;

public class Code21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long[] num = new long[4];
		String[] arr = new String[4];
		for(int i=0; i<arr.length; i++) {
			num[i] = sc.nextLong();
            arr[i] = String.valueOf(num[i]);
		}
		long first = Long.parseLong(arr[0] + arr[1]);  
		long second = Long.parseLong(arr[2] + arr[3]);
		System.out.println(first + second);

	}

}
