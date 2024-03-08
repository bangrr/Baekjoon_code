import java.util.*;
import java.io.*;

public class Bj_1629_recursion {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        System.out.print(abmodc(a, b, c));
    }

    private static long abmodc(long a, long b, long c) {
        if (b == 1) return a % c;
        long val = abmodc(a, b/2, c);
        val = val * val % c;
        if (b%2 == 0) return val;
        return val * a % c;
    }
}