import java.io.*;
import java.util.*;

public class Bj_15501 {
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
		Map<Integer, Integer> origin = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			int a = Integer.parseInt(st.nextToken());
			origin.put(a, i);
		}
		
		st = new StringTokenizer(br.readLine());
		int prev = origin.get(Integer.parseInt(st.nextToken()));
		for (int i=2; i<=n; i++) {
			int cur = origin.get(Integer.parseInt(st.nextToken()));
			if (Math.abs(cur-prev) > 1 && Math.abs(cur-prev) != n-1) {
				System.out.print("bad puzzle");
				return;
			}
			prev = cur;
		}
		System.out.print("good puzzle");
	}
}