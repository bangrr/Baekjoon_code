import java.io.*;
import java.util.*;

public class Bj_15652 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] selected;
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		selected = new int[M+1];
		
		// 아래서 selected[k-1] 을 사용하기 위해 초기값을 만들어 줌
		selected[0] = 1;
		
		rec_func(1);
		System.out.print(sb.toString());
	}
	
	static void rec_func(int k) {
		/*
		 * 1 <= N <= M <= 8
		 * 1부터 N까지 자연수 중에서 M개를 고른 수열
		 * 같은 수를 여러 번 골라도 된다.
		 * 고른 수열은 오름차순이어야 한다.
		 * 중복되는 수열을 여러 번 출력하면 안된다.
		 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
		 */
		
		if (k == M + 1) { // 채울 자리를 넘었다
			// selected[1...M] 배열이 새롭게 탐색된 결과
			for (int i = 1; i <= M; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
		} else {
			// 1~N 까지를 
			for (int cand = selected[k-1]; cand <= N; cand++) {
				// k번째에 cand가 올 수 있으면
				selected[k] = cand;
				
				// 다음 자리 채워주는 함수 호출
				rec_func(k + 1);
			}
		}
	}
}