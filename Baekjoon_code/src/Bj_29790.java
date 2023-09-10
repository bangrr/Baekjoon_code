import java.io.*;
import java.util.*;

public class Bj_29790 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int U = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		if (N >= 1000) {
			if (U >= 8000 || L >= 260) {
				System.out.println("Very Good");				
			} else {
				System.out.println("Good");
			}
		} else {
			System.out.println("Bad");
		}
	}
}