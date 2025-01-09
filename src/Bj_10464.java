import java.io.*;
import java.util.*;

public class Bj_10464 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            sb.append(xorAll(a-1) ^ xorAll(b)).append("\n");
        }
        System.out.print(sb);
    }

    static private long xorAll(long n) {
        if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else if (n % 4 == 3) {
            return 0;
        } else {
            return n;
        }
    }
}
