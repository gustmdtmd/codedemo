package codetest;

import java.util.Scanner;

public class Code55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		int res = 0;
		for(int i=0; i<data.length(); i++) {
			switch(data.charAt(i)) {
			case 'A' :
			case 'B' :
			case 'C' : res+=3; break;
			case 'D' :
			case 'E' :
			case 'F' : res+=4; break;
			case 'G' :
			case 'H' :
			case 'I' : res+=5; break;
			case 'J' :
			case 'K' :
			case 'L' : res+=6; break;
			case 'M' :
			case 'N' :
			case 'O' : res+=7; break;
			case 'P' :
			case 'Q' :
			case 'R' :
			case 'S' : res+=8; break;
			case 'T' :
			case 'U' :
			case 'V' : res+=9; break;
			case 'W' :
			case 'X' :
			case 'Y' :
			case 'Z' : res+=10; break;
			}
		}
		System.out.println(res);

	}

}
