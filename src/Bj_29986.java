import java.io.*;
import java.util.*;

public class Bj_29986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) <= h) {
                ans++;
            }
        }
        System.out.print(ans);
    }
}