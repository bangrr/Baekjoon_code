import java.io.*;
import java.util.*;

public class Bj_29766 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		int cnt = 0;
		for (int i=0; i<s.length()-3; i++) {
			if (s.charAt(i) == 'D' && s.charAt(i+1) == 'K' && s.charAt(i+2) == 'S' && s.charAt(i+3) == 'H') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}