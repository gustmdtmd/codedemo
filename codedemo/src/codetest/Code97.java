package codetest;

import java.util.Scanner;

public class Code97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = 0, res = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					temp = arr[i] + arr[j] + arr[k];
					
					if(temp>=res && temp<=M)
						res = temp;
				}
			}
		}
		System.out.println(res);

	}

}
