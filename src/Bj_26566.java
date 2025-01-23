import java.io.*;
import java.util.*;

public class Bj_26566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if ((double)a/b > (double)c*c*Math.PI/d) {
                sb.append("Slice of pizza\n");
            } else {
                sb.append("Whole pizza\n");
            }
        }
        System.out.print(sb);
    }
}
