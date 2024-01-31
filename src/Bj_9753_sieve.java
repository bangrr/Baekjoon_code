import java.io.*;
import java.util.*;

public class Bj_9753_sieve {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static final int MAX = 100000;
	static boolean[] notPrime = new boolean[MAX+1];
	static boolean[] arr = new boolean[MAX+3];
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		solve();
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			for (int i=n; i<=100001; i++) {
				if (arr[i]) {
					sb.append(i).append("\n");
					break;
				}
			}
		}
	}
	
	// 문제해결
	static void solve() {
		notPrime[0] = notPrime[1] = true;
		for (int i=2; i*i<=MAX; i++) {
			if (!notPrime[i]) {
				for (int j=i*i; j<=MAX; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		for (int i=2; i<=MAX; i++) {
			if (!notPrime[i]) {
				for (int j=i+1; j<=MAX; j++) {
					if (!notPrime[j]) {
						if (1L*i*j > 100002) break;
						arr[i*j] = true;
					}
				}
			}
		}
	}
}