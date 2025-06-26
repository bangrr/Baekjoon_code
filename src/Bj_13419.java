import java.util.*;
import java.io.*;

public class Bj_13419 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();
        StringBuilder sb = new StringBuilder();

        int t = rd.nextInt();
        while (t-- > 0) {
            String s = rd.nextLine();
            if (s.length() % 2 == 0) {
                for (int i=0; i<s.length(); i+=2) {
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
                for (int i=1; i<s.length(); i+=2) {
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
            } else {
                for (int i = 0; i < s.length(); i += 2) {
                    sb.append(s.charAt(i));
                }
                for (int i = 1; i < s.length(); i += 2) {
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
                for (int i = 1; i < s.length(); i += 2) {
                    sb.append(s.charAt(i));
                }
                for (int i = 0; i < s.length(); i += 2) {
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
            }
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