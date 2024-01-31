import java.io.*;
import java.util.*;

public class Bj_2902 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		if (s.length() > 0) {
			System.out.print(s.charAt(0));
			for (int i=1; i<s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && s.charAt(i-1) == '-') {
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}