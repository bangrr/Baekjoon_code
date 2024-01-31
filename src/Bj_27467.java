import java.io.*;
import java.util.*;

public class Bj_27467 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		double p = 0;
		double q = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			double tmp = Double.parseDouble(st.nextToken());
			if (tmp % 3 == 0) {
				q++;
			} else if (tmp % 3 == 1) {
				p++;
			} else if (tmp % 3 == 2) {
				p--;
				q--;
			}
		}
		System.out.printf("%.9f %.9f", p, q);
	}
}