import java.io.*;
import java.util.*;

public class Bj_30618 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<n; i+=2) {
			sb.append(i).append(" ");
		}
		if (n%2!=0) {
			sb.append(n).append(" ");
			for (int i=n-1; i>0; i-=2) {
				sb.append(i).append(" ");
			}
		} else {
			for (int i=n; i>0; i-=2) {
				sb.append(i).append(" ");
			}
		}
		System.out.print(sb);
	}
}