import java.io.*;
import java.util.*;

public class Bj_7595 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}