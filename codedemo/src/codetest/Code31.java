package codetest;

import java.util.Scanner;

public class Code31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		String[] arr = data.split(" ");
		int[] num = new int[3]; 
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		if(num[0]==num[1] && num[1]==num[2])
			System.out.println(10000+num[0]*1000);
		else if(num[0]==num[1] || num[1]==num[2] || num[0]==num[2]) {
			if(num[0]==num[1]) {
				System.out.println(1000+num[0]*100);
			}else if(num[1]==num[2]) {
				System.out.println(1000+num[1]*100);
			}else
				System.out.println(1000+num[2]*100);
		}else {
			for(int i=0; i<num.length; i++) {
				if(max<num[i])
					max = num[i];
			}
			System.out.println(max * 100);
		}
	}
}
