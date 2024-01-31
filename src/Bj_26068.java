import java.io.*;

public class Bj_26068 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			Integer x = Integer.parseInt(br.readLine().substring(2));
			if (x < 91) cnt++;
		}
		System.out.print(cnt);
	}
}