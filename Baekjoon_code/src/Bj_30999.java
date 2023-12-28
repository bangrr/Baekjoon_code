import java.io.*;
import java.util.*;

public class Bj_30999 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a = 0;
		for (int i=0; i<n; i++) {
			String s = br.readLine();
			int t = 0;
			for (int j=0; j<m; j++) {
				char c = s.charAt(j);
				if (c == 'O') t++;
				else t--;
			}
			if (t > 0) a++;
		}
		System.out.print(a);
	}
}