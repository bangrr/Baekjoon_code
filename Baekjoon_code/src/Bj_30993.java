import java.io.*;
import java.util.*;

public class Bj_30993 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());		
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		long z = 1;
		for (int i=1; i<=n; i++) {
			z *= i;
		}
		for (int i=1; i<=a; i++) {
			z /= i;
		}
		for (int i=1; i<=b; i++) {
			z /= i;
		}
		for (int i=1; i<=c; i++) {
			z /= i;
		}
		System.out.print(z);
	}
}