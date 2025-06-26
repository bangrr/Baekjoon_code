import java.util.*;
import java.io.*;

public class Bj_4592 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = rd.nextInt();
            if (n == 0) {
                break;
            }
            int t = 0;
            for (int i=0; i<n; i++) {
                int a = rd.nextInt();
                if (t != a) {
                    sb.append(a).append(" ");
                    t = a;
                }
            }
            sb.append("$").append("\n");
        }
        System.out.print(sb);
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