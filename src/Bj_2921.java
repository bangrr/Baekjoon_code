import java.io.*;
import java.util.*;

public class Bj_2921 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int m = 0;
		for (int i=1; i<=n; i++) {
			m += i;
			sum += m * 3;
		}
		System.out.print(sum);
	}
}