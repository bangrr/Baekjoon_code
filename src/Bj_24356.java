import java.io.*;
import java.util.*;

public class Bj_24356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int start = t1 * 60 + m1;
        int end = t2 * 60 + m2;
        int ans = end - start;
        if (ans < 0) {
            ans += 1440;
        }
        System.out.print(ans + " " + ans/30);
    }
}