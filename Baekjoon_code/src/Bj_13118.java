import java.io.*;
import java.util.*;

public class Bj_13118 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int arr[] = new int[5];
		st = new StringTokenizer(br.readLine());
		for (int i=1; i<=4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int tmp = Integer.parseInt(st.nextToken());
		for (int j=1; j<=4; j++) {
			if (arr[j] == tmp) {
				System.out.println(j);
				return;
			}
		}
		System.out.print(0);
	}
}