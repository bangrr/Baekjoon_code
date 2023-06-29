import java.io.*;
import java.util.*;

public class Bj_10996 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			if (n % 2 == 0) {
				sb.append("*").append(" *".repeat((n-1)/2)).append("\n");
				sb.append(" *".repeat(n/2)).append("\n");
			} else {
				sb.append("*").append(" *".repeat(n/2)).append("\n");
				sb.append(" *".repeat((n-1)/2)).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}