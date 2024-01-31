import java.io.*;
import java.util.*;

public class Bj_30802 {
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
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int tsum = 0;
		for (int i=0; i<6; i++) {
			int tdiv = arr[i] / t;
			tsum += (arr[i]%t==0?tdiv:tdiv+1);
		}
		sb.append(tsum).append("\n");
		
		int pdiv = n / p;
		sb.append(pdiv).append(" ").append(n%p);
	}
}