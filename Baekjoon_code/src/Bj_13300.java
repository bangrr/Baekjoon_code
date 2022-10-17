import java.io.*;
import java.util.*;

public class Bj_13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[][] room = new int[2][6];
		int s = 0, y = 0;
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			// s=0=female s=1=male
			room[s][y-1]++;
		}
		int ans = 0;
		for (int i=0; i<2; i++) {
			for (int j=0; j<6; j++) {
				if (room[i][j] > 0 && room[i][j] % k == 0) {
					ans += room[i][j]/k;
				} else if (room[i][j] > 0 && room[i][j] % k != 0) {
					ans += room[i][j]/k+1;
				}
			}
		}
		System.out.print(ans);
	}
}