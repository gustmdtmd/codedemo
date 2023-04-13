package codetest;

import java.util.Arrays;
import java.util.Scanner;

public class Code104 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		avg = sum/5;
		System.out.println(avg);
		System.out.println(arr[2]);
		

	}

}
