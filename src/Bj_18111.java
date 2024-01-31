import java.io.*;
import java.util.*;

public class Bj_18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 1 ~ 500
		int m = Integer.parseInt(st.nextToken());	// 1 ~ 500
		int b = Integer.parseInt(st.nextToken());	// 0 ~ 64,000,000
		int[][] arr = new int[n][m];
		int lowest = Integer.MAX_VALUE;
		int highest = 0;
		int t = Integer.MAX_VALUE;	// 걸리는 시간
		int h = 0;	// 최종 땅의 높이

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				highest = Math.max(highest, arr[i][j]);
				lowest = Math.min(lowest, arr[i][j]);
			}
		}
		
		/*
		 * 1. 제거해서 인벤에 넣는다 -- 2초 tmp < arr[i][j]; sum += 차; b++;
		 * 2. 블록을 꺼내 올려 놓는다 -- 1초 tmp > arr[i][j]; sum += 차; b--;
		 * 걸리는 최소 시간과 그 경우 통일된 땅의 높이
		 * 땅의 높이는 0 ~ 256
		 */
		int tmp = highest;
		for (int z = lowest; z <= highest; z++) {
			int sum = 0;
			int cnt = b;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (tmp < arr[i][j]) {
						sum += (arr[i][j] - tmp) * 2;
						cnt += arr[i][j] - tmp;
					} else if (tmp > arr[i][j]) {
						sum += tmp - arr[i][j];
						cnt -= tmp - arr[i][j];
					}
				}
			}
			if (cnt >= 0 && t > sum) {
				t = sum;
				h = tmp;
			}
			tmp--;
		}
		System.out.println(t + " " + h);
	}
}