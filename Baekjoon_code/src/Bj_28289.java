import java.io.*;
import java.util.*;

public class Bj_28289 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int so = 0, im = 0, in = 0, aa = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int gp = Integer.parseInt(st.nextToken());
			int cp = Integer.parseInt(st.nextToken());
			int np = Integer.parseInt(st.nextToken());
			
			if (gp == 1) {
				aa++;
			} else if (cp == 1 || cp == 2) {
				so++;
			} else if (cp == 3) {
				im++;
			} else if (cp == 4) {
				in++;
			}
		}
		System.out.println(so);
		System.out.println(im);
		System.out.println(in);
		System.out.println(aa);
	}
}