import java.io.*;
import java.util.*;

public class BJ_15663 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected, arr;
	static boolean[] visited;
	static HashSet<String> answer;
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		selected = new int[M];
		visited = new boolean[N];
		answer = new LinkedHashSet<>();
		
		rec_func(0);
		sb = new StringBuilder();
		for (String s : answer) sb.append(s).append("\n");
		System.out.print(sb);
	}
	
	static void rec_func(int k) {
		if (k == M) {
			sb = new StringBuilder();
			for (int iter : selected) {
				sb.append(iter).append(" ");
			}
			answer.add(sb.toString());
		} else {
			for (int cand = 0; cand < N; cand++) {
				if (visited[cand]) continue;
				visited[cand] = true;
				selected[k] = arr[cand];
				rec_func(k + 1);
				visited[cand] = false;
			}
		}
	}
}