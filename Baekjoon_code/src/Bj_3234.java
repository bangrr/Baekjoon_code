import java.io.*;
import java.util.*;

public class Bj_3234 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		
		int x = 0, y = 0;
		if (Math.abs(n - x) <= 1 && Math.abs(m - y) <= 1) {
			sb.append(0).append("\n");
		}
		
		String s = br.readLine();
		for (int i = 0; i < k; i++) {
			char c = s.charAt(i);
			
			if (c == 'I') {
				x++;
			} else if(c == 'Z') {
				x--;
			} else if(c == 'S') {
				y++;
			} else if(c == 'J') {
				y--;
			}
			
			if (Math.abs(n - x) <= 1 && Math.abs(m - y) <= 1) {
				sb.append(i+1).append("\n");
			}
		}
		if (sb.toString().length() > 0) {
			System.out.print(sb.toString());
			return;
		}
		System.out.print(-1);
	}
}