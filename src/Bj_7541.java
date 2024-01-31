import java.io.*;
import java.util.*;

public class Bj_7541 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	// main 메소드
	public static void main(String[] args) throws IOException {
		input();
		System.out.print(sb.toString());
	}
	
	// 입력부
	static void input() throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] factors = {9, 3, 7};
		for (int i=1; i<=n; i++) {
			String s = br.readLine();
			int checksum = 0;
			int qmarkFac = 0;
			for (int j=s.length()-1; j>=0; j--) {
				char c = s.charAt(j);
				if (c >= '0' && c <= '9') {
					checksum = checksum + (c-'0') * factors[(s.length()-1-j)%3];
				} else {
					qmarkFac = factors[(s.length()-1-j)%3];
				}
			}
			
			for (int k=0; k<=9; k++) {
				if (10-checksum%10 == 10) {
					print(s, i, 0);
					break;
				} else if ((k * qmarkFac) % 10 == 10-checksum%10) {
					print(s, i, k);
					break;
				}
			}
		}
	}
	
	static void print(String s, int i, int k) {
		System.out.println("Scenario #" + i + ":");
		System.out.println(s.replace('?', (char)(k + '0')));
		System.out.println();
	}
}