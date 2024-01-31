import java.io.*;

public class Bj_26766 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = " @@@   @@@ \n"
				+ "@   @ @   @\n"
				+ "@    @    @\n"
				+ "@         @\n"
				+ " @       @ \n"
				+ "  @     @  \n"
				+ "   @   @   \n"
				+ "    @ @    \n"
				+ "     @     ";
		sb.append(s);
		for (int i=1; i<n; i++) {
			sb.append("\n").append(s);
		}
		System.out.print(sb);
	}
}