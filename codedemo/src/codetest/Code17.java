package codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Code17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		char[][] A = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++)
				A[i][j] = str.charAt(j);
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (A[j][i] == (char)0)
					continue;
				System.out.print(A[j][i]);
			}
		}

	}

}
