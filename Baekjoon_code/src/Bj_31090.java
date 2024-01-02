import java.io.*;
import java.util.*;

public class Bj_31090 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if ((n+1)%(n%100)==0) sb.append("Good");
			else sb.append("Bye");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}