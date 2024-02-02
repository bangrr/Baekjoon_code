import java.util.*;
import java.io.*;

public class Bj_1138 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = rd.nextInt();
        int[] arr = new int[n];
        for (int i=1; i<=n; i++) {
            int seq = rd.nextInt();
            int cnt = 0;
            for (int j=0; j<n; j++) {
                if (arr[j] == 0) {
                    if (seq == cnt) {
                        arr[j] = i;
                        break;
                    }
                    cnt++;
                }
            }
        }

        for (int it : arr) {
            sb.append(it).append(" ");
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