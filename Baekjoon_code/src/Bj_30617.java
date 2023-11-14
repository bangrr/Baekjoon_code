import java.io.*;
import java.util.*;

public class Bj_30617 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[t+1][2];
		int cnt = 0;
		for (int i=1; i<=t; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			if (arr[i][0] != 0 && arr[i-1][0] == arr[i][0]) {
				cnt++;
			}
			if (arr[i][1] != 0 && arr[i-1][1] == arr[i][1]) {
				cnt++;
			}
			if (arr[i][0] != 0 && arr[i][1] != 0 && arr[i][0] == arr[i][1]) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}