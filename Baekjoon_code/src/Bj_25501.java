import java.io.*;

public class Bj_25501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			System.out.println(isPalindrome(br.readLine()));
		}
	}

	public static String recursion(String s, int l, int r, int c) {
		c++;
		if (l >= r) {
			return "1 " + c;
		} else if (s.charAt(l) != s.charAt(r)) {
			return "0 " + c;
		} else {
			return recursion(s, l + 1, r - 1, c);
		}
	}

	public static String isPalindrome(String s) {
		int c = 0;
		return recursion(s, 0, s.length() - 1, c);
	}
}