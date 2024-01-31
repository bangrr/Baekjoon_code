import java.io.*;
import java.util.*;

public class Bj_19685 {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long s = Long.parseLong(st.nextToken());
		long e = Long.parseLong(st.nextToken());
		
		for (long i=s; i<=e; i++) {
			isPalindrome(i);
		}
		System.out.print(sb.toString());
	}
	
	static void isPalindrome(long n) {
		String s = String.valueOf(n);
		int len = s.length();
		
		if (len > 1) {
			for (int i=0; i<len/2; i++) {
				if (s.charAt(i) != s.charAt(len-1-i)) {
					sb.append(s).append("\n");
					return;
				}
			}
		}
		sb.append("Palindrome!\n");
		return;
	}
}