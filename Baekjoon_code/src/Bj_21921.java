import java.io.*;
import java.util.*;
 
public class Bj_21921 {
	// 입출력 메소드
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
 
	// main 메소드
	public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n+1];
        int[] s = new int[n+1];
		int max = 0;
        int cnt = 0;
 
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            s[i] = s[i-1] + a[i];
        }
        for (int i=0; i+k<=n; i++) {
            int sum = s[i+k] -s[i];
            if (max < sum) {
                max = sum;
                cnt = 1;
            } else if (max == sum) {
                cnt++;
            }
        }
        if (max == 0) {
            System.out.print("SAD");
        } else {
            System.out.println(max);
            System.out.print(cnt);
        }
	}
}