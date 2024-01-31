import java.io.*;

public class Bj_11655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'M' || c >= 'a' && c <= 'm') {
				c += 13;
				sb.append(c);
			} else if (c >= 'N' && c <= 'Z' || c >= 'n' && c <= 'z') {
				c -= 13;
				sb.append(c);
			} else {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}