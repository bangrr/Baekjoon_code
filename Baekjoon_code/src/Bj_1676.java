import java.io.*;
import java.math.BigInteger;

public class Bj_1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger n = new BigInteger(br.readLine());
		BigInteger res = BigInteger.ONE;
		for (int i=1; i<=n.intValue(); i++) {
			res = res.multiply(new BigInteger(String.valueOf(i)));
		}
		String s = res.toString();
		int ans = 0;
		for (int i=s.length()-1; i>=0; i--) {
			if (s.charAt(i) == '0') {
				ans++;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}