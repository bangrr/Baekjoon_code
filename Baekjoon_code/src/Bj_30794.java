import java.io.*;
import java.util.*;

public class Bj_30794 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int lv = Integer.parseInt(st.nextToken());
		String s = st.nextToken();
		int ans = 0;
		switch (s) {
			case "miss": ans = 0;
				break;
			case "bad": ans = (lv * 200);
				break;
			case "cool": ans = (lv * 400);
				break;
			case "great": ans = (lv * 600);
				break;
			case "perfect": ans = (lv * 1000);
				break;
		}
		System.out.print(ans);
	}
}