import java.util.*;
import java.io.*;

public class Bj_1449 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int N = rd.nextInt();
        int L = rd.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = rd.nextInt();
        }
        Arrays.sort(arr);

        int cur = 1;
        int ans = 1;
        for (int i=1; i<N; i++) {
            cur += (arr[i] - arr[i-1]);
            if (cur > L) {
                cur = 1;
                ans++;
            }
        }
        System.out.print(ans);
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