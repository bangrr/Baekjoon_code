import java.io.*;
import java.util.*;

public class Bj_32205 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (set.contains(a) || set.contains(b) || set.contains(c)) {
                ans = 1;
                break;
            }
            set.add(a);
            set.add(b);
            set.add(c);
        }
        System.out.print(ans);
    }
}