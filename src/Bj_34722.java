import java.io.*;
import java.util.*;

public class Bj_34722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (s >= 1000 || c >= 1600 || a >= 1500 || (r > 0 && r <= 30)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}