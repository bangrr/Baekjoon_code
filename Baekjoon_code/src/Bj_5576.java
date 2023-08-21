import java.io.*;
import java.util.*;

public class Bj_5576 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int[] w = new int[10];
		for (int i=0; i<10; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(w);
		
		int[] k = new int[10];
		for (int i=0; i<10; i++) {
			k[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(k);
		
		System.out.print((w[7]+w[8]+w[9]) + " " + (k[7]+k[8]+k[9]));
	}
}