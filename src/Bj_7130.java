import java.io.*;
import java.util.*;

public class Bj_7130 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum += c*m > b*h ? c*m : b*h;
		}
		System.out.println(sum);
	}
}