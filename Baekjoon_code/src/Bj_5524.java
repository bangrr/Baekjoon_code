import java.io.*;

public class Bj_5524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			sb.append(br.readLine().toLowerCase()).append("\n");
		}
		System.out.print(sb.toString());
	}
}