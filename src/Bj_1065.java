import java.io.*;

public class Bj_1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			if (i / 100 < 1) {
				cnt++;
			} else if (i/100 - i%100/10 == i%100/10 - i%10) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}