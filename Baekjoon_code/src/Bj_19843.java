import java.io.*;
import java.util.*;

public class Bj_19843 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri"};
		List<String> week = Arrays.asList(day);
		
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			sum += (Math.abs((week.indexOf(st.nextToken()) * 24 + Integer.parseInt(st.nextToken())) - (week.indexOf(st.nextToken()) * 24 + Integer.parseInt(st.nextToken()))));
		}
		System.out.println(t-sum > 48 ? -1 : t-sum <= 0 ? 0 : t-sum);
	}
}