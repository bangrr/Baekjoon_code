import java.io.*;
import java.util.*;

public class Bj_9295 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			sb.append("Case ").append(i).append(": ");
			sb.append((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb.toString());
	}
}