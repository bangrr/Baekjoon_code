import java.io.*;

public class Bj_2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int c = Integer.parseInt(br.readLine());
			
			int q = 0; // 25
			int d = 0; // 10
			int n = 0; // 5
			int p = 0; // 1
			
			if (c >= 25) {
				q = c / 25;
				c = c % 25;
			}
			if (c >= 10) {
				d = c / 10;
				c = c % 10;
			}
			if (c >= 5) {
				n = c / 5;
				c = c % 5;
			}
			if (c >= 1) {
				p = c;
			}
			System.out.println(q + " " + d + " " + n + " " + p);
		}
	}
}