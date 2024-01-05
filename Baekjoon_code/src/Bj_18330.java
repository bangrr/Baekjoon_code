import java.io.*;
import java.util.*;

public class Bj_18330 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		if (60 + k >= n) {
			System.out.print(n * 1500);
		} else {
			System.out.print((60 + k) * 1500 + (n - 60 - k) * 3000);
		}
	}
}