import java.io.*;
import java.util.*;

public class Bj_11536 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		String[] inc = Arrays.copyOf(arr, n);
		String[] dec = Arrays.copyOf(arr, n);
		Arrays.sort(inc);
		Arrays.sort(dec, Comparator.reverseOrder());
		
		if (Arrays.toString(inc).equals(Arrays.toString(arr))) {
			sb.append("INCREASING");
		} else if (Arrays.toString(dec).equals(Arrays.toString(arr))) {
			sb.append("DECREASING");
		} else {
			sb.append("NEITHER");
		}
		System.out.print(sb);
	}
}