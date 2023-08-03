import java.io.*;
import java.util.*;

public class Bj_23730 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] answer = new int[n+2];
		Set<Integer> correct = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) {
			correct.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i=1; i<=n; i++) {
			if (!correct.contains(i)) {
				answer[i] = pick(answer, i);
			}
			sb.append(answer[i]).append(" ");
		}
	}
	
	static int pick(int[] arr, int idx) {
		int ret = -1; // 함수오류 확인차
		for (int i=1; i<=5; i++) {
			if (i != arr[idx-1] && i != arr[idx] && i != arr[idx+1]) {
				ret = i;
				break;
			}
		}
		return ret;
	}
}