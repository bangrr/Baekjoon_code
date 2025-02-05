import java.io.*;
import java.util.*;

public class Bj_17010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            sb.append(String.valueOf(c).repeat(Math.max(0, n))).append("\n");
        }
        System.out.print(sb);
    }
}
