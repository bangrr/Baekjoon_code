import java.io.*;
import java.util.*;

public class Bj_27724 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int max = 0;
		int ans = 0;
		
		for (int i=1; i<=18; i++) {
			if (k / (int)Math.pow(2, i) == 1) {
				ans = i;
			}
			if (n / (int)Math.pow(2, i) == 1) {
				max = i;
			}
		}
		
		if (ans + m > max) {
			System.out.print(max);
		} else {
			System.out.print(ans + m);
		}
	}
}