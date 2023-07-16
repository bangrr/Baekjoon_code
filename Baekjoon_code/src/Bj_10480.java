import java.io.*;
import java.util.*;

public class Bj_10480 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			if (x % 2 == 0) {
				System.out.println(x + " is even");
			} else {
				System.out.println(x + " is odd");
			}
		}
	}
}