import java.io.*;
import java.util.*;

public class Bj_1309 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static int[] cage;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		System.out.print(cage[n]);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
	}
	
	// 출력부
	static void solve() {
		cage = new int[n+1];
		cage[0] = 1;
		cage[1] = 3;
		for (int i=2; i<=n; i++) {
			cage[i] = (2*cage[i-1] + cage[i-2]) % 9901;
//			System.out.println(cage[i]);
		}
	}
	
	// cage[i] = cage[i-1] + (cage[i-1]+(cage[i-1]-cage[i-2])/2)*2
	
	/*
	 * n = 1=3
	 * 00 01 10
	 * 
	 * n = 2=7 = 3 + 2 + 2
	 * 00 00 00 01 01 10 10  
	 * 00 01 10 00 10 00 01
	 * 
	 * n = 3=17 = 7 + 5 + 5
	 * 00 00 00 00 00 00 00 01 01 01 01 01 10 10 10 10 10
	 * 00 00 00 10 10 01 01 00 00 00 10 10 00 00 00 01 01
	 * 00 01 10 00 01 00 10 00 01 10 00 01 00 01 10 00 10
	 * 
	 * n = 4=41 = 17 + 12 + 12
	 * 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 01 01 01 01 01 01
	 * 00 00 00 00 00 00 00 01 01 01 01 01 10 10 10 10 10 00 00 00 00 00 00 00
	 * 00 00 00 10 10 01 01 00 00 00 10 10 00 00 00 01 01 00 00 00 01 01 10 10
	 * 00 01 10 00 01 00 10 00 01 10 00 01 00 01 10 00 10 00 01 10 00 10 00 01
	 */
}