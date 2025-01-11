import java.io.*;
import java.util.*;

public class Bj_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int max = 0;
            String ans = "";
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int l = Integer.parseInt(st.nextToken());
                if (max < l) {
                    max = l;
                    ans = s;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
