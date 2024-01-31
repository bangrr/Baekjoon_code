import java.io.*;
import java.util.*;

public class Bj_6588 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static final int MAX = 1000001;
	static boolean[] notPrime = new boolean[MAX];
	static int n;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		sieveOfEratosthenes();
		input();
		System.out.print(sb.toString());
	}
	
	static void sieveOfEratosthenes() {
		notPrime[0] = notPrime[1] = true;
		
		for (int i=2; i*i<MAX; i++) {
			if (!notPrime[i]) {
				for (int j=i*i; j<MAX; j+=i) {
					notPrime[j] = true;
				}
			}
		}
	}
	
	// 입력부
	static void input() throws IOException {
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) {
				return;
			}
			solve();
		}
	}
	
	// 출력부
	static void solve() {
		for (int i=3; i<= n/2; i++) {
			if (!notPrime[i] && !notPrime[n-i]) {
				print(n, i, n-i);
				return;
			}
		}
		sb.append("Goldbach's conjecture is wrong.\n");
	}
	
	static void print(int n, int a, int b) {
		sb.append(n).append(" = ").append(a).append(" + ").append(b).append("\n");
	}
}