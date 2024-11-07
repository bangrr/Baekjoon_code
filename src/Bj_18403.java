import java.io.*;
import java.util.*;

public class Bj_18403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), ", ");
            while (st.hasMoreTokens()) {
                int y = Integer.parseInt(st.nextToken());
                if (y % 4 == 0) {
                    sb.append(y).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}