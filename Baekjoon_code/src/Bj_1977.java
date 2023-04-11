import java.io.*;

public class Bj_1977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10000;
		
		for (int i=m; i<=n; i++) {
//			System.out.println(Math.sqrt(i)*10%10);
			if (Math.sqrt(i)*10%10 == 0) {
				sum += i;
				if (i < min) {
					min = i;
				}
			}
		}
		
		if (sum != 0) {
			System.out.println(sum);
			System.out.print(min);
		} else {
			System.out.print(-1);
		}
	}
}