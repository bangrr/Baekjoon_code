import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Bj_1793 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static BigInteger[] memo;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		dp();
		input();
	}
	
	// 입력부
	static void input() throws IOException {
		String s;
		while((s = br.readLine()) != null) {
			n = Integer.parseInt(s);
			solve();
		}
	}
	
	// 출력부
	static void solve() {
		System.out.println(memo[n]);
	}
	
	// memo
	static void dp() {
		memo = new BigInteger[251];
		memo[0] = memo[1] = BigInteger.ONE;
		for (int i=2; i<=250; i++) { // BigInteger.TWO is since java 9
			memo[i] = memo[i-1].add(memo[i-2].multiply(BigInteger.TWO));
		}
	}
}