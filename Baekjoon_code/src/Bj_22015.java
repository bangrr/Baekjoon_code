import java.io.*;
import java.util.*;

public class Bj_22015 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[3];
		int max = 0;
		for (int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		System.out.println(max*3-arr[0]-arr[1]-arr[2]);
	}
}