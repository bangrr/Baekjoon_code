import java.io.*;
import java.util.*;

public class Bj_22524 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String right = "yuiophjklnm";
        String s;
        while (!(s = br.readLine()).equals("#")) {
            int cnt = 0;
            int prev = right.contains(String.valueOf(s.charAt(0))) ? 1 : 2;
            for (int i = 1; i < s.length(); i++) {
                int cur = right.contains(String.valueOf(s.charAt(i))) ? 1 : 2;
                if (prev == 1) {
                    if (cur == 2) {
                        cnt++;
                        prev = cur;
                    }
                } else {
                    if (cur == 1) {
                        cnt++;
                        prev = cur;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}