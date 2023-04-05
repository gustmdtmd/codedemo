package codetest;

import java.math.BigInteger;
import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        BigInteger b1 = sc.nextBigInteger();
	        BigInteger b2 = sc.nextBigInteger();

	        String s1 = b1.toString();
	        String s2 = b2.toString();

	        // 2진수를 10진수로 변환
	        BigInteger a = new BigInteger(s1, 2);
	        BigInteger b = new BigInteger(s2, 2);

	        // 10진수로 변환한 두 수를 더하고
	        BigInteger sum = a.add(b);

	        // 두 수를 더한 sum의 값을 2진수로 다시 변환
	        String result = sum.toString(2);
	        System.out.println(result);
    }

}
