import java.io.*;

public class Bj_1668 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] left = new int[n];
		int max = 0;
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			left[i] = Integer.parseInt(br.readLine());
			if (max < left[i]) {
				max = left[i];
				cnt++;
			}
		}
		sb.append(cnt).append("\n");
		
		max = 0;
		cnt = 0;
		for (int i=n-1; i>=0; i--) {
			if (max < left[i]) {
				max = left[i];
				cnt++;
			}
		}
		sb.append(cnt);
		System.out.print(sb);
	}
}