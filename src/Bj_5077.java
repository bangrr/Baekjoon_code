import java.util.*;
import java.io.*;

public class Bj_5077 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int t = rd.nextInt();
        while (t-- > 0) {
            int fr = rd.nextInt();
            int fc = rd.nextInt();
            char[][] fa = new char[fr][fc];
            for (int i=0; i<fr; i++) {
                fa[i] = rd.nextLine().toCharArray();
            }
            int sr = rd.nextInt();
            int sc = rd.nextInt();
            char[][] sa = new char[sr][sc];
            for (int i=0; i<sr; i++) {
                sa[i] = rd.nextLine().toCharArray();
            }
            int ans = 0;
            for (int i=0; i<sr-fr+1; i++) {
                for (int j=0; j<sc-fc+1; j++) {
                    int cnt = 0;
                    for (int k=0; k<fr; k++) {
                        for (int l=0; l<fc; l++) {
                            if (fa[k][l] == sa[i+k][j+l]) {
                                cnt++;
                            }
                        }
                    }
                    if (cnt == fr*fc) ans++;
                }
            }
            sb.append(ans).append("\n");
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