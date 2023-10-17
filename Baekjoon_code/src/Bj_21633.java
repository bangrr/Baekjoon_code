import java.io.*;
import java.util.*;

public class Bj_21633 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		double d = 25 + (double)n/100;
		if (d < 100) {
			d = 100;
		} else if (d > 2000) {
			d = 2000;
		}
		System.out.printf("%.2f", d);
	}
}