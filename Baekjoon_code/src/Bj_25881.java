import java.io.*;
import java.util.*;

public class Bj_25881 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int sum = 0;
			int e = Integer.parseInt(br.readLine());
			if (e <= 1000) {
				sum += e * a;
			} else {
				sum += 1000 * a;
				sum += (e-1000) * b;
			}
			sb.append(e).append(" ").append(sum).append("\n");
		}
		System.out.print(sb);
	}
}