import java.io.*;
import java.util.*;

public class Bj_31738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long ans = 1;
        if (n >= m) {
            ans = 0;
        } else {
            for (int i = 2; i <= n; i++) {
                ans = (ans * i) % m;
                if (ans == 0) {
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}