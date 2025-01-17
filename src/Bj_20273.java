import java.io.*;
import java.util.*;

public class Bj_20273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            double sh = Math.sqrt(b*b - a*a)/2.0;
            double lo = b/2.0;
            sb.append((int)(Math.round(Math.PI*sh*lo/100))*100).append("\n");
        }
        System.out.print(sb);
    }
}
