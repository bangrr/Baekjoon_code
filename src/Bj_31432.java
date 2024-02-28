import java.util.*;
import java.io.*;

public class Bj_31432 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int n = rd.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = rd.nextInt();
        }
        System.out.println("YES");
        if (n == 1) {
            if (arr[0] == 0) {
                System.out.print(0);
            } else if (arr[0] == 1) {
                System.out.print(111);
            } else {
                System.out.print(arr[0]*11);
            }
        } else {
            if (arr[1] == 1) {
                System.out.print(10);
            } else {
                System.out.print(arr[1]*11);
            }
        }
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