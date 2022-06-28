import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Bj_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		for (int i=0; i<n; i++) {
			bw.write(a[i] + "\n");
		}
		bw.flush();
	}
}