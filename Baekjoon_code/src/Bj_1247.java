import java.io.*;
import java.util.*;

public class Bj_1247 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int t = 3;
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int under = 0;
			int over = 0;
			long sum = 0;
			while (n-- > 0) {
				long a = Long.parseLong(br.readLine());
				if (sum > 0 && a > 0 && sum + a < 0) over++;
				else if (sum < 0 && a < 0 && sum + a > 0) under++;
				sum += a;
			}
			if (under > over || (under == over && sum < 0)) {
				System.out.println("-");
			} else if (under < over || (under == over && sum > 0)) {
				System.out.println("+");
			} else if (under == over && sum == 0) {
				System.out.println(0);
			}
		}
	}
}