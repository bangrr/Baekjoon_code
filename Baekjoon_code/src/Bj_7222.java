import java.io.*;
import java.util.*;

public class Bj_7222 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		list.add(0);
		list.add(v);
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int m = 0;
		for (int i=1; i<list.size(); i++) {
			m = Math.max(m, list.get(i)-list.get(i-1));
			if (list.get(i) == v) {
				break;
			}
		}
		System.out.println(m);
	}
}