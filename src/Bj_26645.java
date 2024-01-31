import java.io.*;

public class Bj_26645 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		if (n<206) {
			sb.append(1);
		} else if (n<218) {
			sb.append(2);
		} else if (n<229) {
			sb.append(3);
		} else {
			sb.append(4);
		}
		System.out.print(sb);
	}
}