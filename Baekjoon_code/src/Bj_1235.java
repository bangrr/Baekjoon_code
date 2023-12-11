import java.io.*;
import java.util.*;

public class Bj_1235 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		int len = arr[0].length();
		for (int ans = 1; ans<=len; ans++) {
			Set<String> set = new HashSet<>();
			for (int j=0; j<n; j++) {
				String s = arr[j].substring(len-ans);
				if (set.contains(s)) {
					break;
				} else {
					set.add(s);
				}
			}
			if (set.size() == n) {
				System.out.println(ans);
				return;
			}
		}
	}
}