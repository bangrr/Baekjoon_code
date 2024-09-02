import java.io.*;
import java.util.*;

public class Bj_32185 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int t = v+p+s;
            if (t <= sum) map.put(i, t);
        }
        sb.append(0);
        for (int i : map.keySet()) {
            if (--m == 0) break;
            sb.append(" ").append(i);
        }
        System.out.print(sb);
    }
}