package codetest;

import java.util.Scanner;

public class Code42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[9];
		int max = 0;
		for(int i=0; i<list.length; i++) {
			list[i] = sc.nextInt();
			if(max<list[i])
				max=list[i];
		}
		System.out.println(max);
		for(int i=0; i<list.length; i++) {
			if(max==list[i])
				System.out.println(i+1);
		}

	}

}
