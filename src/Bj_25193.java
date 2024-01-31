import java.io.*;

public class Bj_25193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			if (br.read() == 67) {
				cnt++;
			}
		}
		System.out.print(n/(n-cnt+1));
	}
}