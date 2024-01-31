import java.io.*;
import java.util.*;

public class Bj_1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(lcm(a, b)).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	static int lcm(int a, int b) {
		return Math.abs(a*b/gcd(a,b));
	}
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}
}