import java.io.*;

public class Bj_26574 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			String s = br.readLine();
			sb.append(s).append(" ").append(s).append("\n");
		}
		System.out.print(sb);
	}
}