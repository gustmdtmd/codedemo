package codetest;

import java.util.Scanner;

public class Code6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		int tem = a;
		
		while(true) {
	      cnt++;
		  
	      int b = tem/10 + tem%10;
		  int c = (tem%10)*10 + b%10;
		  
		  tem = c;
		  
		  if(tem == a) break;
		}
		
		System.out.println(cnt);
	}
}
