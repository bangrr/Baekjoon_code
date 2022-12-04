import java.io.*;

public class Bj_3049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int odd = 0;
		int even = 0;
		int ans = 0;
		
		for (int i=3; i<=n; i++) {
			if (i % 2 == 1) {
				odd += i*i - i*6 + 9;
				ans += odd;
			} else {
				even += i*i - i*6 + 9;
				ans += even;
			}
		}
		System.out.print(ans);
	}
}