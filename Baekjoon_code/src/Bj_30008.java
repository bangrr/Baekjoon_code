import java.io.*;
import java.util.*;

public class Bj_30008 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<k; i++) {
			int g = Integer.parseInt(st.nextToken()) * 100 / n;
			if (g <= 4) {
				sb.append(1);
			} else if (g <= 11) {
				sb.append(2);
			} else if (g <= 23) {
				sb.append(3);
			} else if (g <= 40) {
				sb.append(4);
			} else if (g <= 60) {
				sb.append(5);
			} else if (g <= 77) {
				sb.append(6);
			} else if (g <= 89) {
				sb.append(7);
			} else if (g <= 96) {
				sb.append(8);
			} else if (g <= 100) {
				sb.append(9);
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
}