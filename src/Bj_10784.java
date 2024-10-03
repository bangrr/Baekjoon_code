import java.io.*;
import java.util.*;

public class Bj_10784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            double cur = p*(Math.sin(a*i+b)+Math.cos(c*i+d)+2);
            if (max < cur) {
                ans = Math.max(max-min, ans);
                max = cur;
                min = cur;
            }
            if (min > cur) {
                min = Math.min(min, cur);
            }
        }
        System.out.print(Math.max(max-min, ans));
        System.out.println(System.getProperties());
    }
}