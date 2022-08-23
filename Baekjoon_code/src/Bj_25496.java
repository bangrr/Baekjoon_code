import java.io.*;
import java.util.*;

public class Bj_25496 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n+1];
		int s = p;
		
		int cnt = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<n+1; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		
		while (n > 0 ) {
			s = p;
			for (int j=1; j<n+1; j++) {
				s = s + a[j];
				cnt++;
				if (s >= 200) {
					break;
				}
			}
			n--;
		}
		
		if (p >= 200) {
			System.out.println(0);
		} else {
			System.out.println(cnt+1);
		}
	}
}