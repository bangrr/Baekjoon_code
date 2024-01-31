import java.io.*;

public class Bj_9773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String s = br.readLine();
			int a = 0;
			int b;
			for (int i=0; i<s.length(); i++) {
				a += s.charAt(i)-48;
			}
			b = Integer.parseInt(s.substring(10)) * 10;
			int c = a+b;
			if (c > 9999) {
				String tmp = String.valueOf(c).substring(1);
				sb.append(tmp).append("\n");
			} else if (c < 1000) {
				c += 1000;
				sb.append(c).append("\n");
			} else {
				sb.append(c).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}