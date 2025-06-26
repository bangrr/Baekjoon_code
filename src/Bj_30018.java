import java.util.*;
import java.io.*;

public class Bj_30018 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = rd.nextInt();
        int[] aa = new int[n];
        int[] bb = new int[n];
        int ans = 0;
        for (int i=0; i<n; i++) aa[i] = rd.nextInt();
        for (int i=0; i<n; i++) {
            int sub = aa[i] - rd.nextInt();
            ans += (sub > 0 ? sub : -sub);
        }
        System.out.print(ans/2);
    }

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}