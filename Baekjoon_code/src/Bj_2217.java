import java.io.*;
import java.util.*;

public class Bj_2217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int w = 0;
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		
		for (int i=0; i<n; i++) {
			int t = a[i] * (n-i);
			w = w < t ? t : w; 
		}
		System.out.print(w);
	}
}