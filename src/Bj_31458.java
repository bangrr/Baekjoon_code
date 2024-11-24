import java.io.*;
import java.util.*;

public class Bj_31458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int cnt = 0;
            int n = 0;
            for (int i = s.length()-1; i >= 0; i--) {
                char c = s.charAt(i);
                if (cnt >= 0) {
                    if (c == '!') {
                        cnt++;
                    } else {
                        n = c-'0';
                        if (cnt > 0) n = 1;
                        cnt = -1;
                    }
                } else {
                    n ^= 1;
                }
            }
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }
}