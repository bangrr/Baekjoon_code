import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_9316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i=1; i<=n; i++) {
			sb.append("Hello World, Judge ").append(i).append("!\n");
		}
		System.out.print(sb);
	}
}