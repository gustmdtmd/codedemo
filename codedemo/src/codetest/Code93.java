package codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code93 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine());

		System.out.println(n*(n-1)/2);
		System.out.println('2');

	}

}
