import java.io.*;
import java.util.*;

public class Bj_27267 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		if (a*b > c*d) {
			System.out.println("M");
		} else if (a*b < c*d) {
			System.out.println("P");
		} else {
			System.out.println("E");
		}
	}
}