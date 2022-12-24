import java.io.*;

public class Bj_26545 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		while (n-- > 0) {
			ans += Integer.parseInt(br.readLine());
		}
		System.out.println(ans);
	}
}