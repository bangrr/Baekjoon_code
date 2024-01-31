import java.io.*;
import java.util.*;

public class Bj_10833 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			sum += (a % s);
		}
		sb.append(sum);
		System.out.print(sb.toString());
	}
}