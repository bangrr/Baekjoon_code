import java.io.*;
import java.util.*;

public class Bj_25496 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		int s = p;
		
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		if (p >= 200) {
			System.out.println(0);
		} else {
			for (int i=0; i<n; i++) {
				s += a[i];
				cnt = i;
				if (s >= 200) {
					break;
				}
			}
			System.out.println(cnt+1);
		}
	}
}