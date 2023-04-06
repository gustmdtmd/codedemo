package codetest;

import java.util.Scanner;

public class Code38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int a = 1;
			for(int j=1; j<=num; j++) {
				if(i <= num-a)
					System.out.print(' ');
				else
					System.out.print('*');
				a++;
			}
			System.out.println();
		}

	}

}
