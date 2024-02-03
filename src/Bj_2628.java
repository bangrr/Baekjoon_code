import java.util.*;
import java.io.*;

public class Bj_2628 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int c = rd.nextInt();
        boolean[] col= new boolean[c+1];
        col[0] = col[c] = true;
        int r = rd.nextInt();
        boolean[] row = new boolean[r+1];
        row[0] = row[r] = true;

        int t = rd.nextInt();
        while (t-- > 0) {
            int zo = rd.nextInt();
            int n = rd.nextInt();
            if (zo == 0) row[n] = true;
            else col[n] = true;
        }
        int maxC = 0;
        int maxR = 0;
        int prevC = 0;
        int prevR = 0;
        for (int i=1; i<=c; i++) {
            if (col[i]) {
                maxC = Math.max(maxC, i - prevC);
                prevC = i;
            }
        }
        for (int i=1; i<=r; i++) {
            if (row[i]) {
                maxR = Math.max(maxR, i - prevR);
                prevR = i;
            }
        }
        System.out.print(maxC * maxR);
    }

    static class FastReader {
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