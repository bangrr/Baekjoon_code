import java.io.*;
import java.util.*;
 
public class Bj_30821 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
        int n = 5;
		int m = Integer.parseInt(br.readLine());
		int ans = 1;
		for (int k = 1; k<=Math.min(n, m-n); k++) {
			ans *= m-k+1;
			if (ans % k == 0) {
				ans /= k;
			}
		}
		System.out.print(ans);
	}
}