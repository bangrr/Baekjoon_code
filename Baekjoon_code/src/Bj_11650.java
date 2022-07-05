import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj_11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][2];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return Integer.compare(o1[1],  o2[1]);
			} else {
				return Integer.compare(o1[0],  o2[0]);
			}
		});
		for (int i=0; i<n; i++) {
			sb.append(a[i][0] + " " + a[i][1] + "\n");
		}
		System.out.println(sb);
	}
}
