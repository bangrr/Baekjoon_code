import java.io.*;
import java.util.*;

public class Bj_9663 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n, cnt=0;
	static int[] board;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		board = new int[n];
		recur(0);
		sb.append(cnt);
	}
	
	// 문제해결
	static void recur(int depth) {
		if (depth == n) {
			cnt++;
			return;
		}
		for (int i=0; i<n; i++) {
			board[depth] = i; // depth가 행이고 board[depth]가 열이라고 생각
			if (chkValid(depth)) {
				recur(depth+1);
			}
		}
	}

	static boolean chkValid(int depth) {
		for (int i=0; i<depth; i++) {
			if (board[i] == board[depth]) return false;
			else if (Math.abs(i-depth) == Math.abs(board[i]-board[depth])) return false;
		}
		return true;
	}
}