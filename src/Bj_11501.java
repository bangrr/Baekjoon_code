import java.util.*;
import java.io.*;

public class Bj_11501 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = rd.nextInt();
        while (t-- > 0) {
            int n = rd.nextInt();
            int[] arr = new int[n];
            long ans = 0;
            for (int i=0; i<n; i++) {
                arr[i] = rd.nextInt();
            }

            int max = arr[n-1];
            for (int i=n-2; i>=0; i--) {
                if (arr[i] >= max) {
                    max = arr[i];
                } else {
                    ans += (max-arr[i]);
                }
            }
            sb.append(ans).append("\n");
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