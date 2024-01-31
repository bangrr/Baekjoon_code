import java.io.*;
import java.util.*;
 
public class Bj_29734 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long z = Long.parseLong(st.nextToken());
		long d = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long m = Long.parseLong(st.nextToken());
		long s = Long.parseLong(st.nextToken());
 
		long zz = z%8==0 ? z/8-1 : z/8;
        long dd = d%8==0 ? d/8-1 : d/8;
 
        long zip = zz*s + z;
        long dok = m+dd*(m+s+m) + d;
		System.out.println(zip < dok ? "Zip\n"+zip : "Dok\n"+dok);
	}
}