import java.io.*;
import java.util.*;

public class Bj_15726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		
		if (b > c) {
			sb.append((int)(a*b/c));
		} else {
			sb.append((int)(a/b*c));
		}
		System.out.print(sb);
	}
}