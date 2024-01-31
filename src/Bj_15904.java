import java.io.*;

public class Bj_15904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String ans = "";
		int idx = 0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'U' && idx == 0) {
				ans += c;
				idx++;
			}
			if (c == 'C' && idx == 1) {
				ans += c;
				idx++;
			}
			if (c == 'P' && idx == 2) {
				ans += c;
				idx++;
			}
			if (c == 'C' && idx == 3) {
				ans += c;
				idx++;
			}
			if (idx == 4) {
				break;
			}
		}
		if (ans.equals("UCPC")) {
			System.out.print("I love UCPC");
		} else {
			System.out.print("I hate UCPC");
		}
	}
}