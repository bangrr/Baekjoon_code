import java.io.*;
import java.util.*;

public class Bj_32941 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        String ans = "YES";
        while (n-- > 0) {
            boolean chk = false;
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<k; i++) {
                if (x == Integer.parseInt(st.nextToken())) {
                    chk = true;
                }
            }
            if (!chk) {
                ans = "NO";
            }
        }
        System.out.print(ans);
    }
}
