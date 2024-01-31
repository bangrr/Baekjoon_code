import java.io.*;
import java.util.*;

public class Bj_24623 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static double a;
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		a = Double.parseDouble(br.readLine());
	}
	
	// 문제해결
	static void solve() {
		System.out.println((int)((180 - a) / 2 + (180 - (180-a)) / 2));
	}
}