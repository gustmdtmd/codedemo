package codetest;

import java.util.Scanner;

public class Code64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		int len = data.length();
		for(int i=0; i< data.length()-1; i++) {
			if(data.charAt(i)=='c' && data.charAt(i+1)=='=')
				len--;
			if(data.charAt(i)=='c' && data.charAt(i+1)=='-')
				len--;
			if(data.charAt(i)=='d' && data.charAt(i+1)=='-')
				len--;
			if(data.charAt(i)=='l' && data.charAt(i+1)=='j')
				len--;
			if(data.charAt(i)=='n' && data.charAt(i+1)=='j')
				len--;
			if(data.charAt(i)=='s' && data.charAt(i+1)=='=')
				len--;
			if(data.charAt(i)=='z' && data.charAt(i+1)=='=')
				len--;
			if(i < data.length()-2) {
				if(data.charAt(i)=='d' && data.charAt(i+1)=='z' && data.charAt(i+2)=='=')
					len--;
			}
		}
		
		System.out.println(len);

	}

}
