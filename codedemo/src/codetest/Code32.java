package codetest;

import java.util.Scanner;

public class Code32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int kinds = sc.nextInt();
		int sum = 0;
		for(int i = 0 ; i < kinds ; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();
			sum += (price * count);
		}
		if(money == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();

	}

}
