import java.io.*;
import java.util.*;

public class Bj_28074 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static String s;
	static Set<Character> set = new HashSet<>();
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		solve();
		
		if (set.size() == 5) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
	
	// 입력부
	static void input() throws IOException {
		s = br.readLine();
	}
	
	// 문제해결
	static void solve() {
		if (s.length() < 5) {
			return;
		}
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'M' && !set.contains('M')) {
				set.add('M');
			} else if (s.charAt(i) == 'O' && !set.contains('O')) {
				set.add('O');
			} else if (s.charAt(i) == 'B' && !set.contains('B')) {
				set.add('B');
			} else if (s.charAt(i) == 'I' && !set.contains('I')) {
				set.add('I');
			} else if (s.charAt(i) == 'S' && !set.contains('S')) {
				set.add('S');
			}
		}
	}
}