import java.io.*;
import java.util.*;

public class Bj_10103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int a = 100;
		int b = 100;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int aa = Integer.parseInt(st.nextToken());
			int bb = Integer.parseInt(st.nextToken());
			if (aa > bb) {
				b -= aa;
			} else if (aa < bb) {
				a -= bb;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}