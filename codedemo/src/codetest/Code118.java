package codetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Code118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i=0; i<n; i++) {
			String name = sc.next();
			String state = sc.next();
			
			if(map.containsKey(name)) {
				map.remove(name);
			}else {
				map.put(name, state);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(String li : list)
			System.out.println(li);
	}

}
