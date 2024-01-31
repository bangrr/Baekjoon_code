import java.io.*;
import java.util.*;

public class Bj_2010 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i=0; i<n; i++) {
			cnt += Integer.parseInt(br.readLine());
		}
		System.out.print(cnt+1-n);
	}
}