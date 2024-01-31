import java.io.*;

public class Bj_13909 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int i = 1;
		while (true) {
			if (i*i <= n && (i+1)*(i+1) > n) {
				break;
			}
			i++;
		}
		System.out.print(i);
	}
}