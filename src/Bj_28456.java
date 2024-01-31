import java.io.*;
import java.util.*;

public class Bj_28456 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int n;
	static int[][] arr, tmp;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			int qry = Integer.parseInt(st.nextToken());
			if (qry == 1) {
				qry_1(Integer.parseInt(st.nextToken()));
				continue;
			}
			if (qry == 2) {
				qry_2();
				continue;
			}
		}
		
		printArr();
	}
	
	// 1번 쿼리
	static void qry_1(int i) {
		int last = arr[i][n];
		for (int j=n; j>1; j--) {
			arr[i][j] = arr[i][j-1];
		}
		arr[i][1] = last;
	}
	
	// 2번 쿼리
	static void qry_2() {
		// tmp 배열 생성
		tmp = new int[n+1][n+1];
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				tmp[i][j] = arr[i][j];
			}
		}
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				arr[j][n-i+1] = tmp[i][j];
			}
		}
	}
	
	// 배열 출력
	static void printArr() {
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
	}
}