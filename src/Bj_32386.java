import java.io.*;
import java.util.*;

public class Bj_32386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map  = new HashMap<>();
        String ans = "";
        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while (t-- > 0) {
                String tag = st.nextToken();
                int cnt = map.getOrDefault(tag, 0) + 1;
                map.put(tag, cnt);
                if (max < cnt) {
                    ans = tag;
                    max = cnt;
                } else if (max == cnt) {
                    ans = "-1";
                }
            }
        }
        System.out.print(ans);
    }
}