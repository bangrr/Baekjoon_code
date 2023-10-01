import java.io.*;
import java.util.*;
 
public class Bj_2435 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
        int[] s = new int[n+1];
 
        st = new StringTokenizer(br.readLine());
		for (int i=1; i<=n; i++) {
            int a = Integer.parseInt(st.nextToken());
            s[i] = s[i-1] + a;
        }
 
        int ans = Integer.MIN_VALUE;
		for (int i=k; i<=n; i++) {
            ans = Math.max(ans, s[i]-s[i-k]);
        }
        System.out.println(ans);
	}
}