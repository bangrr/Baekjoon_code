import java.io.*;
import java.util.*;

public class Bj_4195 {
    static int[] arr, cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Map<String, Integer> map = new HashMap<>();
            int seq = 0;

            int f = Integer.parseInt(br.readLine());
            arr = new int[f*2];
            cnt = new int[f*2];
            for (int i = 0; i < f*2; i++) {
                arr[i] = i;
                cnt[i] = 1;
            }
            Set<Integer> set = new HashSet<>();
            while (f-- > 0) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                if (!map.containsKey(a)) {
                    map.put(a, seq++);
                }
                int na = map.get(a);
                String b = st.nextToken();
                if (!map.containsKey(b)) {
                    map.put(b, seq++);
                }
                int nb = map.get(b);

                sb.append(union(Math.min(na, nb), Math.max(na, nb))).append("\n");
            }
        }
        System.out.print(sb);
    }

    static int union(int u, int v) {
        u = find(u);
        v = find(v);

        if (u != v) {
            arr[v] = u;
            cnt[u] += cnt[v];
        }
        return cnt[u];
    }

    static int find(int x) {
        if (arr[x] == x) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }
}