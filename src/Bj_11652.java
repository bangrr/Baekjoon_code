import java.io.*;
import java.util.*;

public class Bj_11652 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static Map<Long, Integer> map = new HashMap<>();
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			Long title = Long.parseLong(br.readLine());
			map.put(title, map.getOrDefault(title, 0) + 1);
		}
	}
	
	// 출력부
	static void solve() {
		int max = 0;
		Long num = Long.MIN_VALUE;
		
		ArrayList<Long> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			if (max < map.get(list.get(i))) {
				max = map.get(list.get(i));
				num = list.get(i);
			}
		}
		System.out.print(num);
	}
}