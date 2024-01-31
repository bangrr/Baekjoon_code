import java.io.*;
import java.util.*;

public class Bj_4779 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static char[] arr;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb);
	}
	
	// 입력부
	static void input() throws IOException {
		String s;
		while ((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			arr = new char[(int) Math.pow(3, n)];
			Arrays.fill(arr, '-');
			int len = arr.length;
			
			rec_func(n, arr, 0, len);
			sb.append(arr).append("\n");
		}
	}
	
	static void rec_func(int n, char[] arr, int start, int len) {
		if (n == 0) {
			return;
		}
		for (int i=start + len/3; i<start + len/3*2; i++) {
			arr[i] = ' ';
		}
		len /= 3;
		rec_func(n-1, arr, start, len);
		rec_func(n-1, arr, start + len*2, len);
	}
}