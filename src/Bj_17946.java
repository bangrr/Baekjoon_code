import java.io.*;

public class Bj_17946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while (n-- > 1) {
			sb.append("1\n");
		}
		sb.append("1");
		System.out.print(sb);
	}
}