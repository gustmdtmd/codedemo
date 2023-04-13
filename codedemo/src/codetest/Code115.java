package codetest;

import java.util.Scanner;

public class Code115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++)
			arr1[i] = sc.nextInt();
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		int[] res = new int[m];
		int cnt = 0;
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
			for(int j=0; j<n; j++) {
				if(arr2[i] == arr1[j]) {
					cnt=1;
				}
			}
			res[i] = cnt;
			System.out.print(res[i] + " ");
			cnt=0;
		}
		
		
		
	}

}
