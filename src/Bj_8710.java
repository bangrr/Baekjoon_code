import java.io.*;
import java.util.*;

public class Bj_8710 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = (w-k)/m;
		System.out.print((w-k)%m==0?t:t+1);
	}
}