import java.io.*;

public class Bj_1550 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int ans = 0;
		for (int i=s.length()-1; i>=0; i--) {
			int tmp = s.charAt(s.length()-1-i);
			if (tmp < 'A') {
				tmp = tmp - '0';
			} else {
				tmp = tmp - 'A' + 10;
			}
			ans = ans + (int)Math.pow(16, i) * tmp;
		}
		System.out.print(ans);
	}
}