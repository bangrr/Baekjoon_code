import java.io.*;

public class Bj_25640 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String j = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i=0; i<n; i++) {
			if(j.equals(br.readLine())) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}