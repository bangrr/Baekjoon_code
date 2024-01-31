import java.io.*;
import java.util.*;

public class Bj_1813 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine()); // 1 <= n <= 50
		int[] arr = new int[51];
		int ans = -1;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		for (int i=0; i<arr.length; i++) {
			if (i == arr[i]) ans = i;
		}
		System.out.println(ans);
	}
}