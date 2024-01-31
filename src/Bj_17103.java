import java.io.*;
import java.util.*;

public class Bj_17103 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static boolean[] notPrime;
	static int n;
	static ArrayList<Integer> primeNums;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		eraPrime();
		input();
		System.out.println(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			solve();
		}
	}
	
	// 출력부
	static void solve() {
		int c = 0; // 갯수
		int i = 0;
		int j = primeNums.size()-1;
		
		while (i <= j) { // 투포인터로 해서 양쪽에서 줄여나가면서 확인하기
			int sum = primeNums.get(i) + primeNums.get(j);
			if (sum > n) {
				j--;
				continue;
			} else if (sum < n) {
				i++;
				continue;
			}
			c++;
			i++;
			j--;
		}
		sb.append(c).append("\n");
	}
	
	// 에라토스테네스의 체
	static void eraPrime() {
		int m = 1000000;
		notPrime = new boolean[m+1];
		notPrime[0] = notPrime[1] = true;
		
		for (int i=2; i*i<=m; i++) {
			if (!notPrime[i]) {
				for (int j=i*i; j<=m; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		
		primeNums = new ArrayList<>();
		for (int i=2; i<=m; i++) {
			if (!notPrime[i]) {
				primeNums.add(i);
			}
		}
	}
}