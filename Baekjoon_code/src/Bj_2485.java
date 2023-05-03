import java.io.*;

public class Bj_2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] dist = new int[n-1];
		
		arr[0] = Integer.parseInt(br.readLine());
		for (int i=1; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			dist[i-1] = arr[i]-arr[i-1];
		}
		
		int g = dist[0];
		for (int i=1; i<n-1; i++) {
			g = gcd(dist[i], g);
		}
		
		int ans = 0;
		for (int i=0; i<n-1; i++) {
			ans = ans + dist[i]/g -1;
		}
		
		System.out.print(ans);
	}
	
	static int gcd(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b); 
		
		if (min == 0) {
			return max;
		}
		return gcd(min, max%min);
	}
}