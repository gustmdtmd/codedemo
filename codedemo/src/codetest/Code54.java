package codetest;

import java.util.Scanner;

public class Code54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[2];
		String tem = "";
		int[] res = new int[2];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			for(int j=2; j>=0; j--) {
				tem += arr[i].charAt(j);
			}
			res[i] = Integer.parseInt(tem);
			tem = "";
		}
		
		if(res[0]>res[1])
			System.out.println(res[0]);
		else
			System.out.println(res[1]);

	}

}
