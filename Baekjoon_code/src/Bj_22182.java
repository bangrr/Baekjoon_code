import java.io.*;
import java.util.*;

public class Bj_22182 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		double PI = Math.PI;
		int[] arr = new int[n];
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		double area = r*r*PI;
		for (int s : arr) {
			sb.append(area*s/sum).append("\n");
		}
		System.out.println(sb);
	}
}