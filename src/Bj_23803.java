import java.io.*;
import java.util.*;

public class Bj_23803 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n*4; i++) {
			sb.append("@".repeat(n)).append("\n");
		}
		for (int i=0; i<n; i++) {
			sb.append("@".repeat(n*5)).append("\n");
		}
		System.out.print(sb);
	}
}