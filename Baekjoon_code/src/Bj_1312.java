import java.io.*;
import java.util.*;

public class Bj_1312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		if (a < b) {
			a *= 10;
		} else {
			a = a % b;
		}
		for (int i=1; i<=n; i++) {
			if (a < b) {
				a *= 10;
			}
			if (i==n) {
				System.out.print(a / b);
			}
			a = a % b;
		}
	}
}