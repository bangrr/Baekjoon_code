import java.io.*;
import java.util.*;
 
public class Bj_31247 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) { // n이하 k특별수
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if (k > 63) {
                sb.append(0).append("\n");
            } else {
                long d = (long)Math.pow(2, k);
                sb.append(n/d%2==0?n/d/2:n/d/2+1).append("\n");
            }
        }
        System.out.print(sb);
	}
}