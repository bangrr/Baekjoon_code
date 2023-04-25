import java.io.*;
import java.util.*;

public class Bj_9063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int left = 10000;
		int right = -10000;
		int top = -10000;
		int bottom = 10000;
		
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if (left > x) {
				left = x;
			}
			if (right < x) {
				right = x;
			}
			if (top < y) {
				top = y;
			}
			if (bottom > y) {
				bottom = y;
			}
		}
		System.out.print((right - left) * (top - bottom));
	}
}