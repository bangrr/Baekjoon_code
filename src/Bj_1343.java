import java.io.*;
import java.util.*;

public class Bj_1343 {
    static StringBuilder sb = new StringBuilder();
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine() + " ";
        cnt = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'X') {
                cnt++;
            } else {
                if(!fill()) {
                    System.out.print(-1);
                    return;
                }
                if (c == '.') {
                    sb.append(c);
                }
            }
        }

        System.out.print(sb);
    }

    static boolean fill() {
        if (cnt%2==1) {
            return false;
        }
        while (cnt > 0) {
            if (cnt >= 4) {
                sb.append("AAAA");
                cnt -= 4;
                continue;
            }
            sb.append("BB");
            cnt -= 2;
        }
        return true;
    }
}