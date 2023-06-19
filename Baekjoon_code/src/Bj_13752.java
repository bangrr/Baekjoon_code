import java.io.*;
import java.util.*;

public class Bj_13752 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int k = Integer.parseInt(br.readLine());
			sb.append("=".repeat(k)).append("\n");
		}
		System.out.print(sb.toString());
	}
}