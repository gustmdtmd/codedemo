package codetest;

import java.util.Scanner;

public class Code88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			
			if(a==b && a==c) {
				System.out.println("Equilateral"); 
			}else if(a+b<=c || a+c<=b || b+c<=a) {
				System.out.println("Invalid");
			}else if(a==b || a==c || b==c) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}
	}

}
