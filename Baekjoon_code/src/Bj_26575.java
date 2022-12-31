import java.io.*;
import java.util.*;

public class Bj_26575 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			double d = Double.parseDouble(st.nextToken());
			double f = Double.parseDouble(st.nextToken());
			double p = Double.parseDouble(st.nextToken());
			System.out.println("$" + String.format("%.2f", d*f*p));
		}
	}
}