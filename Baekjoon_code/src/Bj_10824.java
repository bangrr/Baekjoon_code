import java.io.*;
import java.util.*;

public class Bj_10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		String d = st.nextToken();
		
		long e = Long.parseLong(a+b);
		long f = Long.parseLong(c+d);
		
		System.out.print(e+f);
	}
}