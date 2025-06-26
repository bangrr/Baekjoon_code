import java.util.*;
import java.io.*;

public class Bj_20157 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        HashMap<Double, Integer> pxmap = new HashMap<>();
        HashMap<Double, Integer> nxmap = new HashMap<>();
        int py = 0, ny = 0;

        int n = rd.nextInt();
        int ans = 0;
        while (n-- > 0) {
            double x = rd.nextDouble();
            double y = rd.nextDouble();
            double d = y/x;
            if (x > 0) {
                pxmap.put(d, pxmap.getOrDefault(d, 0)+1);
                ans = Math.max(ans, pxmap.get(d));
            } else if (x < 0) {
                nxmap.put(d, nxmap.getOrDefault(d, 0)+1);
                ans = Math.max(ans, nxmap.get(d));
            } else {
                if (y > 0) {
                    py++;
                    ans = Math.max(ans, py);
                } else if (y < 0) {
                    ny++;
                    ans = Math.max(ans, ny);
                }
            }
        }
        System.out.print(ans);
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