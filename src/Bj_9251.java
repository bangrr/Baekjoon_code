import java.util.*;
import java.io.*;

public class Bj_9251 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        char[] strA = rd.nextLine().toCharArray();
        char[] strB = rd.nextLine().toCharArray();
        int lenA = strA.length;
        int lenB = strB.length;

        int[][] memo = new int[Math.min(lenA, lenB)+1][Math.max(lenA, lenB)+1];

        int max = 0;
        for (int i = 1; i <= Math.min(lenA, lenB); i++) {
            int tmp = 0;
            for (int j = 1; j <= Math.max(lenA, lenB); j++) {
                if (lenA < lenB ? strA[i-1] == strB[j-1] : strA[j-1] == strB[i-1]) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
                max = Math.max(max, memo[i][j]);
            }
        }
        System.out.print(max);
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
