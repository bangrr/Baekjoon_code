import java.io.*;
import java.util.*;

public class Bj_1120 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String[] s = br.readLine().split(" ");
		String a = s[0];
		String b = s[1];
		int[] c = new int[b.length()-a.length()+1];
		int ans = 50;
		for (int i=0; i<b.length()-a.length()+1; i++) {
			for (int j=0; j<a.length(); j++) {
				if (a.charAt(j) != b.charAt(i+j)) {
					c[i]++;
				}
			}
			ans = Math.min(ans, c[i]);
		}
		System.out.print(ans);
	}
}