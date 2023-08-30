import java.io.*;
import java.util.*;

public class Bj_23037 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int s = Integer.parseInt(br.readLine());
		int sum = 0;
		while (s > 0) {
			sum += Math.pow(s%10, 5);
			s /= 10;
		}
		System.out.println(sum);
	}
}