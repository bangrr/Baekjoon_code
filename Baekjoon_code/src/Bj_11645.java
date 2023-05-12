import java.io.*;
import java.util.*;

public class Bj_11645 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.println(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			Set<String> set = new HashSet<>();
			int n = Integer.parseInt(br.readLine());
			while (n-- > 0) {
				set.add(br.readLine());
			}
			sb.append(set.size()).append("\n");
		}
	}
}