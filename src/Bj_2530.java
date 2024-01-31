import java.io.*;
import java.util.*;

public class Bj_2530 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(br.readLine());
		
		c += d%60;
		while (c>=60) {
			c -= 60;
			b++;
		}
		b += d/60;
		d -= d/60*60;
		while (b>=60) {
			b -= 60;
			a++;
		}
		a += d/3600;
		while (a>=24) {
			a -= 24;
		}
		
		sb.append(a + " " + b + " " + c);
		System.out.println(sb);
	}
}