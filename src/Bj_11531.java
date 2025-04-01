import java.io.*;
import java.util.*;

public class Bj_11531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        int time = 0;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            if (m == -1) break;

            String name = st.nextToken();
            String result = st.nextToken();
            if (result.equals("right")) {
                cnt++;
                time += (map.getOrDefault(name, 0) + m);
            } else {
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + 20);
                } else {
                    map.put(name, 20);
                }
            }
        }
        System.out.print(cnt + " " + time);
    }
}