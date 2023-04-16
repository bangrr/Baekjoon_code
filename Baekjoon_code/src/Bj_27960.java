import java.io.*;
import java.util.*;

public class Bj_27960 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = 0;
		
		for (int i = 512; i > 0; i /= 2) {
			int cnt = 0;
			if (a >= i) {
				a -= i;
				cnt++;
			}
			if (b >= i) {
				b -= i;
				cnt++;
			}
			if (cnt == 1) {
				c += i;
			}
		}
		System.out.print(c);
	}
}