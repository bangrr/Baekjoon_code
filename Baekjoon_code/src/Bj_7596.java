import java.io.*;
import java.util.*;

public class Bj_7596 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = 1;
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			String[] arr = new String[n];
			for (int i=0; i<n; i++) {
				arr[i] = br.readLine();
			}
			Arrays.sort(arr);
			sb.append(t++).append("\n");
			for (String s : arr) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
}