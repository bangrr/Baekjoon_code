import java.io.*;

public class Bj_9461 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		long[] memo = new long[101];
		memo[1] = 1;
		memo[2] = 1;
		memo[3] = 1;
		memo[4] = 2;
		
		for (int i=5; i<=100; i++) {
			memo[i] = memo[i-1] + memo[i-5];
		}
		
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(memo[n]).append("\n");
		}
		System.out.print(sb.toString());
	}
}