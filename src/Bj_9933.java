import java.io.*;
import java.util.*;

public class Bj_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            set.add(s);
            StringBuilder sb = new StringBuilder(s);
            String sr = sb.reverse().toString();
            int len = sr.length();
            if (len % 2 == 1 && set.contains(sr)) {
                System.out.print(len + " " + sr.charAt(len/2));
                return;
            }
        }
    }
}