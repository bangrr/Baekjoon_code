import java.util.*;
import java.io.*;

public class Bj_10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int max = -123456789;
            int n = Integer.parseInt(br.readLine());
            int[] A = new int[n+1];
            int[] S = new int[n+1];
            st = new StringTokenizer(br.readLine());
            for (int i=1; i<=n; i++) {
                A[i] = Integer.parseInt(st.nextToken());
                S[i] = S[i-1] + A[i];
                for (int j=1; j<=i; j++) {
                    max = Math.max(max, S[i]-S[j-1]);
                }
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}