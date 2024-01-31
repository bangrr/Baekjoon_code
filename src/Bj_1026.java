import java.io.*;
import java.util.*;

public class Bj_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Integer[] a = new Integer[n];
		Integer[] b = new Integer[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a, Collections.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b);
		
		int s = 0;
		for (int i=0; i<n; i++) {
			s += a[i]*b[i];
		}
		System.out.print(s);
	}
}