import java.io.*;
import java.util.*;

public class Bj_11725 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static ArrayList<Integer>[] edge;
	static int[] nthParent;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		nthParent[1] = 1;
		dfs(1);
		for (int i=2; i<=n; i++) {
			System.out.println(nthParent[i]);
		}
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		nthParent = new int[n+1];
		edge = new ArrayList[n+1];
		for (int i=1; i<=n; i++) {
			edge[i] = new ArrayList<>();
		}
		
		for (int i=0; i<n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
			edge[b].add(a);
		}
	}
	
	static void dfs(int s) {
		for (int next : edge[s]) {
			if (nthParent[next] == 0) {
				nthParent[next] = s;
				dfs(next);
			}
		}
	}
}