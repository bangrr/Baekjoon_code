import java.io.*;
import java.util.*;

public class Bj_13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		System.out.print(a*b/gcd(a, b));
	}
	
	static long gcd(long a, long b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b); 
		
		if (min == 0) {
			return max;
		}
		return gcd(min, max%min);
	}
}