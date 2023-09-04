import java.io.*;
import java.util.*;

public class Bj_29614 {
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
		String s = br.readLine();
		int cnt = 0;
		double sum = 0;
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) >= 65) {
				cnt++;
				if (s.charAt(i) == 'F') {
					continue;
				} else {
					sum += (69-s.charAt(i));
				}
			} else {
				sum += 0.5;
			}
		}
		System.out.println(sum/cnt);
	}
}