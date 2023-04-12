package codetest;

import java.util.Scanner;

public class Code98 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int result = 0;

		for (int i = 0; i < N; i++) {
			int number = i;
			int sum = 0; // 각 자릿수 합 변수

			while (number != 0) {
				sum += number % 10; // 각 자릿수 더하기
				System.out.println("sum: " + sum);
				number /= 10;
				System.out.println("number: " + number);
			}

			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
			if (sum + i == N) {
				result = i;
				break;
			}

		}

		System.out.println(result);

	}

}
