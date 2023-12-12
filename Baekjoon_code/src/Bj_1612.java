import java.io.*;
import java.util.*;

public class Bj_1612 {
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
		int number = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		
		int target = 0;
		int answer = 0;
		while (true) {
			target = (target * 10 + 1) % number;
			answer++;
			if (target == 0) {
				System.out.println(answer);
				return;
			}
			if (set.contains(target)) {
				System.out.println(-1);
				return;
			}
			set.add(target);
		}
	}
}