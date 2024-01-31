import java.io.*;
import java.util.*;

public class Bj_31009 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int j = 0, c = 0;
		int[] cost = new int[n];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			cost[i] = Integer.parseInt(st.nextToken());
			if ("jinju".equals(s)) j = cost[i];
		}
		for (int i=0; i<n; i++) {
			if (j < cost[i]) c++;
		}
		System.out.println(j);
		System.out.println(c);
	}
}