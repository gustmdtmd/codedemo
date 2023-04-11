package codetest;

import java.util.Scanner;

public class Code80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			int cnt = 0;
			arr[i] = sc.nextInt();
			if(arr[i] != 1) {
				for(int j=2; j<arr[i]; j++) {
					if(arr[i] % j == 0) {
						cnt++;
					}
				}
				if(cnt == 0) {
					res++;
				}
			}
		}
		System.out.println(res);

	}

}
