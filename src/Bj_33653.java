import java.io.*;
import java.util.*;

public class Bj_33653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String w = br.readLine();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            for (int j = 0; j <= s.length() - w.length(); j++) {
                if (w.equals(s.substring(j, j + w.length()))) {
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}