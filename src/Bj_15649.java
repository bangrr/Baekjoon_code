import java.io.*;
import java.util.*;

public class Bj_15649 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M+1];
		
		rec_func(1);
		System.out.print(sb.toString());
	}
	
	static void rec_func(int k) {
		if (k == M + 1) { // 다 골랐다!
			// selected[1...M] 배열이 새롭게 탐색된 결과
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
		} else {
			// 1~N 까지를 k 번 원소로 한 번씩 정하고,
			// 매번 k+1 번부터 M 번 원소로 재귀호출 해주기
			for (int cand = 1; cand <= N; cand++) {
				boolean isUsed = false;
				for (int i=1; i<k; i++) {
					if (cand == selected[i]) {
						isUsed = true;
					}
				}
				if (!isUsed) {
					// k 번째에 cand 가 올 수 있으면
					selected[k] = cand;
					
					// k+1 번 부터 M 번 까지 잘 채워주는 함수를 호출해준다.
					rec_func(k + 1);
					// 사용한 배열 초기화 (사실상 안해도 되는게 아닐까 자바니깐..)
					//selected[k] = 0;
				}
			}
		}
	}
}