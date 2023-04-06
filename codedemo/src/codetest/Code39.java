package codetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Code39 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String str;
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write(A + B + "\n");
		}
		bw.close();
	}

}
