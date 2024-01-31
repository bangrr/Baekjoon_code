import java.io.*;
import java.util.*;

public class Bj_2975 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			char b = st.nextToken().charAt(0);
			int c = Integer.parseInt(st.nextToken());
			
			if (a==0 && b=='W' && c==0) {
				break;
			}
			if (b == 'W') {
				if (c > 200) {
					sb.append("Now allowed");
				} else {
					sb.append(a-c);
				}
			} else if (b == 'D') {
				sb.append(a+c);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}