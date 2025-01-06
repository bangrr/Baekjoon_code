import java.io.*;
import java.util.*;

public class Bj_24268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int minVal = (int) Math.pow(d, d - 1);
        int maxVal = 0;
        for (int i = d-3; i >= 0; i--) {
            minVal = minVal + (int) Math.pow(d, i);
        }
        for (int i = d - 1; i >= 0; i--) {
            maxVal = maxVal + (int) Math.pow(d, i) * i;
        }
        maxVal = Math.min(maxVal, 1000000000);

        if (maxVal < n + 1) {
            System.out.print(-1);
            return;
        }

        if (n + 1 < minVal) {
            n = minVal - 1;
        }

        while (++n <= maxVal) {
            if (check(n, d)) {
                System.out.print(n);
                return;
            }
        }
    }

    private static boolean check(int n, int d) {
        boolean[] used = new boolean[d];
        while (n > 0) {
            int digit = n % d;
            if (used[digit]) {
                return false;
            }
            used[digit] = true;
            n /= d;
        }
        return true;
    }
}
