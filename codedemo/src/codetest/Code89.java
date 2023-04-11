package codetest;


import java.util.Scanner;

public class Code89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max = a<=b && c<=b ? b : a<c ? c : a;
		int mid = a<=b && b<=c ? b : a<c && c<b ? c : a;
		int min = a<=b && a<=c ? a : b<c ? b : c;
		while(true) {
			if(max>=mid+min) {
				max--;
			}else {
				System.out.println(max+mid+min);
				break;
			}
		}
	}

}
