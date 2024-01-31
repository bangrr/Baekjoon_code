import java.io.*;

public class Bj_10844 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long m = 1000000000;
		long ans = 0;
		
		long[][] arr = new long[n+1][10];
		for (int j=1; j<10; j++) {
			arr[1][j] = 1;
		}
		
		for (int i=2; i<=n; i++) {
			arr[i][0] = arr[i-1][1] % m;
			for (int j=1; j<9; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % m;
			}
			arr[i][9] = arr[i-1][8] % m;
		}
		
		for (int j=0; j<10; j++) {
			ans = (ans + arr[n][j]) % m; 
		}
		
		System.out.print(ans);
	}
}