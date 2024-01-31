import java.io.*;
import java.util.*;

public class Bj_25600 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			int a = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			
			sum = a * (d+g);
			if (a == d+g) {
				sum *= 2;
			}
			ans = ans > sum ? ans : sum;
		}
		System.out.print(ans);
	}
}