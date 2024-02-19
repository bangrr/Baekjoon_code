import java.util.*;
import java.io.*;

public class Bj_31408 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = rd.nextInt();
        int[] arr = new int[100001];
        for (int i=0; i<n; i++) {
            arr[rd.nextInt()]++;
        }
        for (int i=0; i<arr.length; i++) {
            if ((n+1)/2 < arr[i]) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
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