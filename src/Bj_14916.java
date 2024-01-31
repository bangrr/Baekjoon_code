import java.io.*;
import java.util.*;

public class Bj_14916 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (true) {
			if (n % 5 == 0) {
				cnt += n/5;
				System.out.print(cnt);
				break;
			} else {
				n -= 2;
				cnt++;
			}
			if (n < 0) {
				System.out.print(-1);
				break;
			}
		}
	}
}