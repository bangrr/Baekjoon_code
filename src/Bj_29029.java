import java.io.*;
import java.util.*;

public class Bj_29029 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int n = 0, e = 0, s = 0, w = 0;
		for (int i=0; i<len; i++) {
			switch (str.charAt(i)) {
			case 'N':
				n++;
				break;
			case 'E':
				e++;
				break;
			case 'S':
				s++;
				break;
			case 'W':
				w++;
				break;
			}
		}
		int max = Math.max(Math.max(Math.max(n, e), s), w);
		System.out.print(len-max);
	}
}