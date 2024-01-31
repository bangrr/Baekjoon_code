import java.io.*;
import java.util.*;

public class Bj_14697 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<=n/a; i++) {
			for (int j=0; j<=n/b; j++) {
				for (int k=0; k<=n/c; k++) {
					if (n == i*a + j*b + k*c) {
						System.out.print(1);
						return;
					}
				}
			}
		}
		System.out.print(0);
	}
}