import java.io.*;
import java.util.*;

public class Bj_30958 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int[] arr = new int[26];
		int m = 0;
		for (int i=0; i<n; i++) {
			char c = str.charAt(i);
			if (c > 96) {
				arr[c-'a']++;
				m = Math.max(m, arr[c-'a']);
			}
		}
		System.out.print(m);
	}
}