import java.io.*;
import java.util.*;

public class Bj_15654 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected, arr;
	
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
		selected = new int[M+1];
		
		rec_func(1);
		System.out.print(sb.toString());
	}
	
	static void rec_func(int k) {
		if (k == M + 1) {
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
		} else {
			for (int cand = 0; cand < N; cand++) {
				boolean isUsed = false;
				for (int i=1; i<k; i++) {
					if (arr[cand] == selected[i]) {
						isUsed = true;
					}
				}
				if (!isUsed) {
					selected[k] = arr[cand];
					rec_func(k + 1);
				}
			}
		}
	}
}