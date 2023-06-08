import java.io.*;
import java.util.*;

public class Bj_10992 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int c = (1<<n)-1;
		if (n % 2 == 1) {
			for (int i = 1; i <= c; i++) {
				for (int j = 1; j <= c - 1 + i; j++) {
					if (i == c) {
						sb.append("*");
					} else if (j == c + 1 - i) {
						sb.append("*");
					} else if (j == c - 1 + i) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				}
				sb.append("\n");
			}
		} else {
			for (int i = c; i >= 1; i--) {
				for (int j = 1; j <= c - 1 + i; j++) {
					if (i == c) {
						sb.append("*");
					} else if (j == c + 1 - i) {
						sb.append("*");
					} else if (j == c - 1 + i) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}