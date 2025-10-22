import java.io.*;
import java.util.*;

public class Bj_11257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String no = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = a+b+c;
            sb.append(no).append(" ").append(d).append(" ");
            if (d >= 55 && a >= 35*0.3 && b >= 25*0.3 && c >= 40*0.3) {
                sb.append("PASS\n");
            } else {
                sb.append("FAIL\n");
            }
        }
        System.out.print(sb);
    }
}