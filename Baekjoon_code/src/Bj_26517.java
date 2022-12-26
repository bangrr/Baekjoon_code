import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Bj_26517 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double k = Double.parseDouble(br.readLine());
		st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		
		double ak = a*k+b;
		double ck = c*k+d;
		if (ak == ck) {
			System.out.println("Yes " + new BigDecimal(ak).toString());
		} else {
			System.out.println("No");
		}
	}
}