import java.io.*;
import java.util.*;

public class Bj_10974 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int N;
	static int[] selected;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		rec_func(1);
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		N = Integer.parseInt(br.readLine());
		selected = new int[N+1];
	}
	
	// 문제해결
	static void rec_func(int k) {
		if (k == N + 1) {
			// selected 배열 출력
			for (int i=1; i<=N; i++) {
				sb.append(selected[i]).append(" ");
			}
			sb.append("\n");
		} else {
			// 1~N 중에서 숫자하나를 정한다
			for (int cand = 1; cand <= N; cand++) {
				boolean isUsed = false;
				// 이미 사용됐는지 selected 배열에서 찾아보기
				for (int i=1; i<k; i++) {
					if (cand == selected[i]) {
						isUsed = true;
					}
				}
				// 사용된 적이 없으면 selected 배열에 넣고 재귀돌리기
				if (!isUsed) {
					selected[k] = cand;
					rec_func(k + 1);
				}
			}
		}
	}
}