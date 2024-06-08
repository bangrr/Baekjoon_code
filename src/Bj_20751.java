import java.io.*;
import java.util.*;

public class Bj_20751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if (r-s <= 1 && r+s >= n) {
                sb.append("Tuzik");
            } else if (c-s <= 1 && c+s >= m) {
                sb.append("Tuzik");
            } else if (r-s <= 1 && c-s <= 1) {
                sb.append("Tuzik");
            } else if (r+s >= n && c+s >= m) {
                sb.append("Tuzik");
            } else {
                sb.append("Barsik");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}