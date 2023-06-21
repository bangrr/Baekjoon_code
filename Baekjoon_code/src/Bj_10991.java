import java.io.*;
import java.util.*;

public class Bj_10991 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i+1; j++) {
				if (j < n-i+1) {
					sb.append(" ");
				} else if (j == n-i+1) {
					sb.append("*");
				}
			}
			sb.append(" *".repeat(i-1)).append("\n");
		}
		System.out.print(sb.toString());
	}
}