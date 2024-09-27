import java.io.*;
import java.util.*;

public class Bj_21507 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        long a2 = Long.parseLong(st.nextToken());
        long a3 = Long.parseLong(st.nextToken());
        long a4 = Long.parseLong(st.nextToken());

        long sum = Math.min(a1, a2) + Math.min(a3, a4);
        System.out.print(sqrt(sum));
    }

    static long sqrt(long n) {
        if (n == 0) return 0;
        long x = n;
        long y = (x + 1) / 2;
        while (y < x) {
            x = y;
            y = (x + n / x) / 2;
        }
        return x;
    }
}