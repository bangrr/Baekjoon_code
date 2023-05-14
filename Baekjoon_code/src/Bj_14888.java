import java.io.*;
import java.util.*;

public class Bj_14888 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// 변수선언부
	static int N, max, min;
	static int[] nums, operators, order;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		rec_func(1, nums[1]);
		sb.append(max).append("\n").append(min);
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		N = Integer.parseInt(br.readLine());
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		nums = new int[N + 1];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		operators = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			operators[i] = Integer.parseInt(st.nextToken());
		}
		
		order = new int[N];
	}
	
	static void rec_func(int k, int value) {
		if (k == N) {
			max = Math.max(max, value);
			min = Math.min(min, value);
		} else { // k번째 연산자는 무엇을 선택할 건지
			for (int i=0; i<4; i++) {
				if (operators[i] >= 1) {
					operators[i]--;
					rec_func(k+1, calculate(value, i, nums[k+1]));
					operators[i]++;
				}
			}
		}
	}
	
	static int calculate(int a, int operator, int b) {
		if (operator == 0) {
			return a+b;
		} else if (operator == 1) {
			return a-b;
		} else if (operator == 2) {
			return a*b;
		} else {
			return a/b;
		}
	}
}