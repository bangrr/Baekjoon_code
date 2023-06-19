import java.io.*;
import java.util.*;

public class Bj_21316 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static ArrayList<Integer>[] edge;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		edge = new ArrayList[13];
		for (int i=1; i<=12; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for (int i=1; i<=12; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
			edge[b].add(a);
		}
		
		for (int i=1; i<=12; i++) {
			if (edge[i].size() == 3) {
				int sum = 0;
				for (int j=0; j<3; j++) {
					int next = edge[i].get(j);
					sum += edge[next].size();
				}
				if (sum == 6) {
					sb.append(i);
					return;
				}
			}
		}
	}
}