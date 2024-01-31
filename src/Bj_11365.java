import java.io.*;

public class Bj_11365 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		while (true) {
			s = br.readLine();
			if (s.equals("END")) {
				break;
			}
			for (int i=0; i<s.length(); i++) {
				sb.append(s.charAt(s.length()-1-i));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}