import java.io.*;
import java.util.*;

public class Bj_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0;
		int[] cnt = new int[8001];
		int c = 0;
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			
			cnt[arr[i]+4000]++;
			c = Math.max(c, cnt[arr[i]+4000]);
		}
		Arrays.sort(arr);
		int mode = cnt[0];
		int chk = 0;
		for (int i=0; i<8001; i++) {
			if (cnt[i] == c) {
				chk++;
				mode = i - 4000;
			}
			if (chk == 2) {
				mode = i - 4000;
				break;
			}
		}
		
		sb.append(Math.round(sum/n)).append("\n");
		sb.append(arr[n/2]).append("\n");
		sb.append(mode).append("\n");
		sb.append(arr[n-1] - arr[0]);
		System.out.print(sb);
	}
}