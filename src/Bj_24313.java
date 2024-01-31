import java.io.*;
import java.util.*;

public class Bj_24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // a*n + b
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		for (int i=n; i<=100; i++) {
			if (a*i + b > c*i) {
				System.out.print(0);
				return;
			}
		}
		System.out.print(1);
	}
}