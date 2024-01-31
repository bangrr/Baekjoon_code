import java.io.*;
import java.util.*;

public class Bj_1302 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static Map<String, Integer> map = new TreeMap<>();
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String title = br.readLine();
			map.put(title, map.getOrDefault(title, 0) + 1);
		}
	}
	
	// 출력부
	static void solve() {
		Iterator<String> keys = map.keySet().iterator();
		int max = 0;
		String ans = null;
		
		while (keys.hasNext()) {
			String str = keys.next();
			if (max < map.get(str)) {
				max = map.get(str);
				ans = str;
			}
		}
		System.out.print(ans);
	}
}