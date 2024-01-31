import java.io.*;
import java.util.*;

public class Bj_5300 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			sb.append(i).append(" ");
			if (i % 6 == 0) {
				sb.append("Go! ");
			}
		}
		if (n % 6 != 0) {
			sb.append("Go!");
		}
		System.out.print(sb);
	}
}