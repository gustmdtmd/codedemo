package codetest;

import java.util.HashSet;
import java.util.Scanner;

public class Code45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> res  = new HashSet<Integer>();
		//중복허용하지않는 set의 특성을 활용.
		
		for(int i=0; i<10; i++) {
			res.add(sc.nextInt()%42);
			// 입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
		
		sc.close();
		System.out.println(res.size());
	}
}
