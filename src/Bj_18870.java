import java.io.*;
import java.util.*;

public class Bj_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] tmp = Arrays.copyOf(arr, n);
		
		Arrays.sort(tmp);
		
		int c = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(tmp[0], c);
		for (int i=1; i<n; i++) {
			if (tmp[i-1] != tmp[i]) {
				c++;
				map.put(tmp[i], c);
			}
		}
		for (int i=0; i<n; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.print(sb.toString());
	}
}