import java.io.*;
import java.util.*;

public class Bj_4141 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		while (n-- > 0) {
			String s = br.readLine().toUpperCase();
			boolean isPal = true;
			for (int i=0; i<s.length()/2; i++) {
				if (arr[s.charAt(i)-65] != arr[s.charAt(s.length()-1-i)-65]) {
					isPal = false;
					break;
				}
			}
			if (isPal) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.print(sb);
	}
}