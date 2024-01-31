import java.io.*;
import java.util.*;

public class Bj_13171 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final long m = 1000000007;
		long a = Long.parseLong(br.readLine());
		long x = Long.parseLong(br.readLine());
		
		ArrayList<Long> list = new ArrayList<>();
		
		long c = 1;
		long t = a;
		while (c <= x) {
			list.add(t);
			t = ((t % m) * (t % m)) % m;
			c *= 2;
		}
		c /= 2;
		
		long ans = 1;
		for (int i=list.size()-1; i>=0; i--) {
			if (x >= c) {
				x -= c;
				ans = ((ans % m) * (list.get(i) % m)) % m;
			}
			c /= 2;
		}
		System.out.print(ans);
	}
}