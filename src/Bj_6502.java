import java.io.*;
import java.util.*;

public class Bj_6502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i=1;;i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            if (r == 0) break;
            int w = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            double d = Math.sqrt(w * w + l * l);
            sb.append("Pizza ").append(i).append(" ");
            sb.append(d <= r * 2 ? "fits" : "does not fit").append(" on the table.\n");
        }
        System.out.print(sb);
    }
}
