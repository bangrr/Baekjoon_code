import java.io.*;
import java.util.*;

public class Bj_30454 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int max = 0;
        int ans = 0;
        while (N-- > 0) {
            String s = br.readLine();
            boolean b = false;
            int cnt = 0;
            for (int i = 0; i < L; i++) {
                char c = s.charAt(i);
                if (!b && c == '1') {
                    cnt++;
                    b = true;
                } else if (c == '0') {
                    b = false;
                }
            }
            if (max < cnt) {
                max = cnt;
                ans = 1;
            } else if (max == cnt) {
                ans++;
            }
        }
        System.out.print(max + " " + ans);
    }
}