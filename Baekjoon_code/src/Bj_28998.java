import java.io.*;
import java.util.*;

public class Bj_28998 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (map.containsKey(x+y)) {
				map.put(x+y, map.get(x+y)+1);
			} else {
				map.put(x+y, 1);
			}
		}
		System.out.print(map.keySet().size());
	}
}