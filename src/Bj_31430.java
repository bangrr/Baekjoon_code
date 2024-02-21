import java.util.*;
import java.io.*;

public class Bj_31430 {
    public static void main(String[] args) {
        FastReader rd = new FastReader();

        int t = rd.nextInt();
        if (t == 1) {
            long a = rd.nextLong();
            long b = rd.nextLong();
            long r = a + b;
            System.out.println(encode(r));
        } else if (t == 2) {
            String s = rd.nextLine();
            System.out.println(decode(s));
        }
    }

    static private String encode(long r) {
        long h = 1;
        int t = 0;
        while (h <= r) {
            h *= 26;
            t++;
        }
        h /= 26;

        StringBuilder sb = new StringBuilder();
        sb.append("a".repeat(13-t));

        while (h > 0) {
            sb.append((char)('a'+r/h));
            r %= h;
            h /= 26;
        }
        return sb.toString();
    }

    static private long decode(String s) {
        if (s.length() != 13) throw new AssertionError();
        long ret = 0;
        long h = 1;
        for (int i=s.length()-1; i>=0; i--) {
            ret += (s.charAt(i)-97) * h;
            h *= 26;
        }
        return ret;
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