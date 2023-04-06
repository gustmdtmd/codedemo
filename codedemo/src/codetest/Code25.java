package codetest;

import java.util.Scanner;

public class Code25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		
		String[] tem = data.split(" ");
		
		
		long a = Long.parseLong(tem[0]);
		long b = Long.parseLong(tem[1]);
		long c = Long.parseLong(tem[2]);
		
		System.out.println(a + b + c);

	}

}
