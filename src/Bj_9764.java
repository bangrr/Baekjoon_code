import java.util.*;
import java.io.*;

public class Bj_9764 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int p = 2000;
        int[][] memo = new int[p+1][p+1];
        Arrays.fill(memo[0], 1);

        for (int i=1; i<=p; i++) {
            for (int j=1; j<=i; j++) {
                memo[i][j] = (memo[i][j-1] + memo[i-j][j-1]) % 100999;
            }
            for (int j=i+1; j<=p; j++) {
                memo[i][j] = memo[i][j-1];
            }
        }

        int t = rd.nextInt();
        while (t-- > 0) {
            int n = rd.nextInt();
            sb.append(memo[n][n]).append("\n");
        }
        System.out.print(sb);
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