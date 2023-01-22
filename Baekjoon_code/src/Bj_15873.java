import java.io.*;

public class Bj_15873 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		if (n%100 == 10) {
			sum = n/100 + 10;
		} else {
			sum = n/10 + n%10;
		}
		System.out.print(sum);
	}
}