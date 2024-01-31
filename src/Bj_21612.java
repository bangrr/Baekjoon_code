import java.io.*;
import java.util.*;

public class Bj_21612 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int a = n * 5 - 400;
		int b = 0;
		if (a > 100) {
			b = -1;
		} else if (a < 100) {
			b = 1;
		}
		System.out.println(a);
		System.out.println(b);
	}
}