import java.io.*;
import java.util.*;

public class Bj_30031 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			if (w == 136) {
				sum += 1000;
			} else if (w == 142) {
				sum += 5000;
			} else if (w == 148) {
				sum += 10000;
			} else if (w == 154) {
				sum += 50000;
			}
		}
		System.out.println(sum);
	}
}