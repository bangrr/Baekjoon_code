import java.io.*;
import java.util.*;

public class Bj_2170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new TreeMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (map.containsKey(l)) {
                int c = map.get(l);
                if (c < r) map.put(l, r);
            } else {
                map.put(l, r);
            }
        }
        int tmp = Integer.MIN_VALUE;
        for (int l : map.keySet()) {
            int r = map.get(l);
            sum += (Math.max(tmp, r) - Math.max(tmp, l));
            tmp = Math.max(tmp, r);
        }
        System.out.print(sum);
    }
}