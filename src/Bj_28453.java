import java.io.*;
import java.util.*;

public class Bj_28453 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	final static int MAX = 300;
	final static int PMAX = 275;
	final static int GMAX = 250;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (n-- > 0) {
			int m = Integer.parseInt(st.nextToken());
			sb.append(chkLevel(m)).append(" ");
		}
	}
	
	// 문제해결
	static int chkLevel(int m) {
		int rtn = 0;
		if (m == MAX) {
			rtn = 1;
		} else if (m >= PMAX) {
			rtn = 2;
		} else if (m >= GMAX) {
			rtn = 3;
		} else if (m > 0) {
			rtn = 4;
		}
		return rtn;
	}
}