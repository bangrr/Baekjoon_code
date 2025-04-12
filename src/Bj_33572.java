import java.io.*;
import java.util.*;

public class Bj_33572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            m -= (Long.parseLong(st.nextToken()) - 1);
        }
        System.out.print(m > 0 ? "OUT" : "DIMI");
    }
}