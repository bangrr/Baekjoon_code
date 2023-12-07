import java.io.*;
import java.util.*;

public class Bj_18511 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, k, ans;
	static int[] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[3];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		recursion(0);
		System.out.print(ans);
	}
	
	// 문제해결
	static void recursion(int cur) {
		if (cur > n) return; // n 보다 크면 의미없음 탈출
		if (ans < cur) ans = cur; // 현재 ans 보다 크면 cur로 업데이트
		for (int i=0; i<k; i++) {
			recursion(cur*10 + arr[i]);
		}
	}
}