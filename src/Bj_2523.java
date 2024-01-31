import java.io.*;

public class Bj_2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=n; i++) {
			sb.append("*".repeat(i)).append("\n");
		}
		for (int i=n-1; i>0; i--) {
			sb.append("*".repeat(i)).append("\n");
		}
		
		System.out.print(sb.toString());
	}
}