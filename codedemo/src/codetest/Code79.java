package codetest;

import java.util.Scanner;

public class Code79 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			
			if(N == -1) break;
			
			int[] arr = new int[N];
			int sum = 0;
			int index = 0; 
			
			
			for(int i=1; i<N; i++) {
				if(N % i == 0) {
					sum += i;
					arr[index++] = i;
				}
				
			}
			
			if(N != sum) {
				System.out.println(N + " is NOT perfect.");
				continue;
			}
			
			System.out.print(N + " = ");
			for(int j=0; j<index; j++) {
				if(j == index - 1) 
					System.out.print(arr[j]);
				else
					System.out.print(arr[j] + " + ");
			}
			System.out.println();
		}
	}
}
