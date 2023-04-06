package codetest;

import java.util.Scanner;

public class Code40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int units = sc.nextInt();
		int[] list = new int[units];
		int cnt = 0;
		for(int i=0; i<list.length; i++) {
			list[i] = sc.nextInt();
		}		
		
		int v = sc.nextInt();
		
		for(int i=0; i<list.length; i++) {
			if(list[i] == v)
				cnt++;
		}
		System.out.println(cnt);

	}

}
