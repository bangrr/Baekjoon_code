import java.io.*;
import java.util.*;

public class Bj_28490 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			m = Math.max(m, Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken()));
		}
		System.out.print(m);
	}
}