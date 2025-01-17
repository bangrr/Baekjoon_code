import java.io.*;
import java.util.*;

public class Bj_4564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            int s = Integer.parseInt(br.readLine());
            if (s == 0) {
                break;
            }

            sb.append(s);
            while (s / 10 > 0) {
                int t = s;
                int m = 1;
                while (t > 0) {
                    m *= (t % 10);
                    t /= 10;
                }
                sb.append(" ").append(m);
                s = m;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
