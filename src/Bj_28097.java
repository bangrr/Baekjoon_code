import java.io.*;
import java.util.*;

public class Bj_28097 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = (n-1) * 8;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.print(sum / 24 + " " + sum % 24);
	}
}