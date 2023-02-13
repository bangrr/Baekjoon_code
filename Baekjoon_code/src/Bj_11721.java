import java.io.*;

public class Bj_11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		for (int i=0; i<s.length(); i++) {
			sb.append(s.charAt(i));
			if (i % 10 == 9) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}