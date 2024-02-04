import java.util.*;
import java.io.*;

public class Bj_15666 {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] arr, selected;

    public static void main(String[] args) {
        FastReader rd = new FastReader();

        n = rd.nextInt();
        m = rd.nextInt();
        arr = new int[n];
        selected = new int[m];
        for (int i=0; i<n; i++) arr[i] = rd.nextInt();
        Arrays.sort(arr);

        recFunc(0, 0);
        System.out.print(sb);
    }

    static void recFunc(int depth, int start) {
        if (depth == m) {
            for (int i=0; i<m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            int prev = 0;
            for (int i=start; i<n; i++) {
                int cur = arr[i];
                if (prev != cur) {
                    selected[depth] = arr[i];
                    prev = cur;
                    recFunc(depth+1, i);
                }
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