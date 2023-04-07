package codetest;

import java.util.Scanner;

public class Code50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int u = sc.nextInt();
		String data = sc.next();
		String[] list = data.split("");
		int hap=0;
		for(int i=0; i<list.length; i++) {
			hap += Integer.parseInt(list[i]);
		}
		System.out.println(hap);

	}

}
