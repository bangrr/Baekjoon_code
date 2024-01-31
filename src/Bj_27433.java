import java.io.*;
import java.util.*;

public class Bj_27433 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static long ans=1;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		System.out.println(solve(n));
	}
	
	// 문제해결
	static long solve(int n) {
		if (n == 0) {
			return ans;
		}
		ans *= n;
		return solve(n-1);
	}
}