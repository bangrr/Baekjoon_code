import java.io.*;
import java.util.*;

public class Bj_25377 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int min = 1001;
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (a <= b) {
				min = min > b ? b : min;
			}
		}
		if (min == 1001) {
			System.out.print(-1);
		} else {
			System.out.print(min);
		}
	}
}