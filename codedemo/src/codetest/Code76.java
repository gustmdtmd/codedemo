package codetest;

import java.math.BigInteger;
import java.util.Scanner;

public class Code76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger add = a.add(b);
		System.out.println(add);

	}

}
