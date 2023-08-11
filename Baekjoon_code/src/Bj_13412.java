import java.io.*;
import java.util.*;
 
public class Bj_13412 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int cnt = 0;
			int n = Integer.parseInt(br.readLine());
			for (int i=1; i*i<=n; i++) {
				if (n%i == 0) {
					if (gcd(i, n/i) == 1) {
						cnt++;
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}
 
	static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return Math.abs(a);
	}
}