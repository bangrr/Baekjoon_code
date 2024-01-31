import java.io.*;
import java.util.*;

public class Bj_15650 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	static boolean[] used;
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M+1];
		used = new boolean[M+1];
		
		rec_func(1);
		System.out.print(sb.toString());
	}
	
	static void rec_func(int k) {
		if (k == M+1) {
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
		} else {
			for (int cand = selected[k-1] + 1; cand <= N; cand++) {
				selected[k] = cand;
				rec_func(k+1);
			}
		}
	}
}