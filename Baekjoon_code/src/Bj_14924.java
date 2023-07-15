import java.io.*;
import java.util.*;

public class Bj_14924 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		System.out.println(d/2/s*t);
	}
}