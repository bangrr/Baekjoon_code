import java.io.*;
import java.util.*;

public class Bj_17502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            char le = s.charAt(i);
            char ri = s.charAt(n-1-i);
            if (le == ri) {
                if (le == '?') {
                    sb.append('a');
                } else {
                    sb.append(le);
                }
            } else {
                if (le == '?') {
                    sb.append(ri);
                } else {
                    sb.append(le);
                }
            }
        }
        System.out.print(sb);
    }
}
