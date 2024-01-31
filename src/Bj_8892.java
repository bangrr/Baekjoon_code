import java.io.*;

public class Bj_8892 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			String[] arr = new String[k];
			for (int i=0; i<k; i++) {
				arr[i] = br.readLine();
			}
			sb.append(mkString(k, arr) + "\n");
		}
		System.out.print(sb);
	}
	
	static String mkString(int k, String[] arr) {
		String s;
		
		for (int i=0; i<k; i++) {
			for (int j=0; j<k; j++) {
				if (i == j) {
					continue;
				}
				s = arr[i] + arr[j];
				if (isPalindrome(s)) {
					return s;
				}
			}
		}
		return "0";
	}
	
	static boolean isPalindrome(String s) {
		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}