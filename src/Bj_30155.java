import java.io.*;
import java.util.*;

public class Bj_30155 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        final int d = 1000000007;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int m = n % 6 == 0 ? 5 : n % 6 - 1;

            long[] arr = new long[]{a, b, b-a, -a, -b, a-b};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    arr[i] += (d * 2);
                    arr[i] %= d;
                }
            }
            sb.append(arr[m] % d).append("\n");
        }
        System.out.print(sb);
    }
}

// f(12) = -f(9) = f(6) = -f(2) + f(1)
// f(11) = -f(8) = f(5) = -f(2)
// f(10) = -f(7) = f(4) = -f(1)
// f(9) = -f(6) = f(2) - f(1)
// f(8) = -f(5) = f(2)
// f(7) = -f(4) = f(1)