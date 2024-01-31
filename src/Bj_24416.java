import java.io.*;

public class Bj_24416 {
	static long[] f = new long[41];
	static long a = 0, b = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		fib(n);
		fibonacci(n);
		System.out.print((a/2+1) + " " + (n-2));
	}
	
	static long fib (int n) {
		a++;
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	static long fibonacci(int n) {
		f[1] = f[2] = 1;
		for (int i=3; i<=n; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}