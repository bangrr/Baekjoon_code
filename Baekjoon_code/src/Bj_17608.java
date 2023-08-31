import java.io.*;
import java.util.*;

public class Bj_17608 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int mi = 0;
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[mi] <= arr[i]) {
				mi = i;
			}
		}
		int max = 0, cnt = 0;
		for (int i=n-1; i>=mi; i--) {
			if (max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}