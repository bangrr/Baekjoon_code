import java.io.*;

public class Bj_25703 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		sb.append("int a;\n");
		sb.append("int *ptr = &a;\n");
		if (n > 1) {
			sb.append("int **ptr2 = &ptr;\n");
			for (int i=3; i<=n; i++) {
				sb.append("int ").append("*".repeat(i)).append("ptr").append(i)
				.append(" = &ptr").append(i-1).append(";\n");
			}
		}
		System.out.print(sb);
	}
}