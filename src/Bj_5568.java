import java.io.*;
import java.util.*;

public class Bj_5568 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, k;
	static int[] arr;
	static boolean[] visited;
	static HashSet<Integer> set;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		arr = new int[n];
		visited = new boolean[n];
		set = new HashSet<>();
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		recur(0, 0);
		System.out.print(set.size());
	}
	
	// 문제해결
	static void recur(int d, int cur) {
		if (d == k) {
			set.add(cur);
			return;
		}
		for (int i=0; i<n; i++) {
			if (visited[i]) continue;
			visited[i] = true;
			recur(d+1, arr[i]>=10?cur*100+arr[i]:cur*10+arr[i]);
			visited[i] = false;
		}
	}
}