import java.io.*;
import java.util.*;

public class Bj_29751 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		sb.append(w*h/2);
		if (w%2==1 && h%2==1) {
			sb.append(".5");
		} else {
			sb.append(".0");
		}
		System.out.print(sb);
	}
}