import java.io.*;
import java.util.*;

public class Bj_15720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		Integer[] btmp = new Integer[b];
		Integer[] ctmp = new Integer[c];
		Integer[] dtmp = new Integer[d];
		int min = Math.min(b, Math.min(c, d));
		int sum = 0;
		int ans = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<b; i++) {
			btmp[i] = Integer.parseInt(st.nextToken());
			sum += btmp[i];
		}
		Arrays.sort(btmp, Comparator.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<c; i++) {
			ctmp[i] = Integer.parseInt(st.nextToken());
			sum += ctmp[i];
		}
		Arrays.sort(ctmp, Comparator.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<d; i++) {
			dtmp[i] = Integer.parseInt(st.nextToken());
			sum += dtmp[i];
		}
		Arrays.sort(dtmp, Comparator.reverseOrder());
		
		for (int i=0; i<min; i++) {
			ans += (btmp[i] + ctmp[i] + dtmp[i]) * 9 / 10;
		}
		for (int i=min; i<b; i++) {
			ans += btmp[i];
		}
		for (int i=min; i<c; i++) {
			ans += ctmp[i];
		}
		for (int i=min; i<d; i++) {
			ans += dtmp[i];
		}
		System.out.println(sum);
		System.out.print(ans);
	}
}