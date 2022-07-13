import java.io.IOException;
import java.util.Scanner;

public class Bj_11659 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+1];
		int[] sum = new int[n+1];
		for (int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
			sum[i] = sum[i-1] + arr[i];
		}
		
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sb.append(sum[b]-sum[a-1] + "\n");
		}
		System.out.print(sb);
		sc.close();
	}
}