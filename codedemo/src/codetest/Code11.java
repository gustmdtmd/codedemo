package codetest;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a1 = new int[30];
		int[] a2 = new int[28];
		
		for(int i=0; i<a1.length; i++) {
			a1[i] = i+1;
		}
		
		for(int i=0; i<a2.length; i++) {
			a2[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a2.length; j++) {
				if(a1[i] == a2[j])
					a1[i] = 0;
			}
		}
		
		for(int i=0; i<a1.length; i++) {
			if(a1[i]!=0)
				System.out.println(a1[i]);
		}

	}

}
