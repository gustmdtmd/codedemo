package codetest;

import java.util.Scanner;

public class Code20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			hap+=arr[i];
		}
		
		int x = hap/60;
		int y = hap%60;
		System.out.println(x);
		System.out.println(y);

	}

}
