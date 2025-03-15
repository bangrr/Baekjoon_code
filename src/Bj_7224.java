import java.io.*;
import java.util.*;

public class Bj_7224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine();

        int cnt = 0;
        int ans = 1;

        for (int i=0; i<k; i++) {
            if (s.charAt(i) == 'L') cnt++;
        }
        int max = cnt;

        for (int i=1; i<n; i++) {
            if (s.charAt(i-1) == 'L') cnt--;
            if (s.charAt(i+k-1) == 'L') cnt++;

            if (max < cnt) {
                max = cnt;
                ans = i+1;
            }
        }
        System.out.print(ans);
    }
}