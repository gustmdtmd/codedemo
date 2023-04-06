package codetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// StringTokenizer 생성자
// 1. StringTokenizer st = new StringTokenizer(문자열);
// 2. StringTokenizer st = new StringTokenizer(문자열, 구분자);
// 3. StringTokenizer st = new StringTokenizer(문자열, 구분자, true/false);
public class Code34 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.close();
	}

}
