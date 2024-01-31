import java.io.*;
import java.util.*;

public class Bj_29155 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] ppp  = new int[6];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=5; i++) {
			ppp[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer>[] arr = new ArrayList[6];
		for (int i=1; i<=5; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for (int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			arr[k].add(t);
		}
		
		for (int i=1; i<=5; i++) {
			Collections.sort(arr[i]);
		}
		
		int sum = 0;
		for (int p=1; p<=5; p++) {
			sum += arr[p].get(0);
			for (int i=1; i<ppp[p]; i++) {
				sum += (2*arr[p].get(i) - arr[p].get(i-1));
			}
			sum += 60;
		}
		System.out.println(sum-60);
	}
}