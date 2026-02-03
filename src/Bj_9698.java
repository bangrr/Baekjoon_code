import java.io.*;
import java.util.*;

public class Bj_9698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            m -= 45;
            if (m < 0) {
                h--;
                m += 60;
                if (h < 0) h += 24;
            }

            sb.append("Case #").append(i).append(": ").append(h).append(" ").append(m).append("\n");
        }
        System.out.print(sb);
    }
}