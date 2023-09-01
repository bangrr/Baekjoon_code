import java.io.*;
import java.util.*;

public class Bj_29546 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n+1];
		for (int i=1; i<=n; i++) {
			arr[i] = br.readLine();
		}
		
		int m = Integer.parseInt(br.readLine());
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			for (int i=l; i<=r; i++) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.print(sb);
	}
}