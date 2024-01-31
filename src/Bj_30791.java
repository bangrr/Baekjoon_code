import java.io.*;
import java.util.*;

public class Bj_30791 {
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
		int e = Integer.parseInt(st.nextToken());
		int cnt = 0;
		if (a-b<=1000) cnt++;
		if (a-c<=1000) cnt++;
		if (a-d<=1000) cnt++;
		if (a-e<=1000) cnt++;
		System.out.print(cnt);
	}
}