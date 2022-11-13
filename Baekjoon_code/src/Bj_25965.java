import java.io.*;
import java.util.*;

public class Bj_25965 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			long[][] kda = new long[m][3];
			for (int j=0; j<m; j++) {
				st = new StringTokenizer(br.readLine());
				kda[j][0] = Integer.parseInt(st.nextToken());
				kda[j][1] = Integer.parseInt(st.nextToken());
				kda[j][2] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			long k = Integer.parseInt(st.nextToken());
			long d = Integer.parseInt(st.nextToken());
			long a = Integer.parseInt(st.nextToken());
			long tmp = 0;
			long sum = 0;
			for (int j=0; j<m; j++) {
				kda[j][0] *= k;
				kda[j][1] *= d;
				kda[j][2] *= a;
				tmp = kda[j][0] - kda[j][1] + kda[j][2];
				if (tmp > 0) {
					sum += tmp;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}