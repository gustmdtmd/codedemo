package codetest;

import java.util.Scanner;

public class Code7 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    double[] arr = new double[n];
	    
	    double max = arr[0];
	    double sum=0;
	    for(int i=0; i<arr.length; i++){
	        arr[i] = s.nextDouble();
	        if(arr[i] > max){
	            max = arr[i];
	        } 
	    }
	    for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }
	    double avg = sum /n;
	    System.out.println(avg);
	}
}
