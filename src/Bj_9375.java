import java.util.*;
import java.io.*;

public class Bj_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                String value = st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0)+1);
            }
            int ans = 1;
            for (String s : map.keySet()) {
                int cs = map.get(s) + 1;
                ans *= cs;
            }
            System.out.println(ans-1);
        }
    }
}