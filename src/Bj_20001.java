import java.io.*;
import java.util.*;

public class Bj_20001 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int q = 0;
		while (true) {
			String s = br.readLine();
			if ("고무오리 디버깅 끝".equals(s)) break;
			if ("문제".equals(s)) { q++; continue; }
			if ("고무오리".equals(s)) {
				if (q==0) {
					q+=2;
					continue;
				} else {
					q--;
					continue;					
				}
			}
		}
		System.out.print(q==0?"고무오리야 사랑해":"힝구");
	}
}