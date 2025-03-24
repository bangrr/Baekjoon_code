import java.io.*;
import java.util.*;

public class Bj_33613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long s = (long) n * n;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        long ans = 0;

        if (n == 3) {
            if (r == 2 && c == 2) {
                ans = 1;
            } else {
                ans = 4;
            }
        } else if (n % 2 == 0) {
            ans = s / 2;
        } else if (n % 2 == 1) {
            if ((r + c) % 2 == 0) {
                ans = s / 2 + 1;
            } else {
                ans = s / 2;
            }
        }
        System.out.print(ans);
    }
}