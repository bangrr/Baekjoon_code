import java.io.*;
import java.util.*;
 
public class Bj_11441 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n+1];
        int[] s = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            s[i] = s[i-1]+a[i];
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(s[j]-s[i-1]).append("\n");
        }
		System.out.print(sb);
	}
}