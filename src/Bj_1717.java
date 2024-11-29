import java.io.*;
import java.util.*;

public class Bj_1717 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        Arrays.fill(arr, -1);

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (k == 0) {
                union(a, b);
            } else if (k == 1) {
                if (find(a) == find(b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            } else {
                throw new RuntimeException();
            }
        }
        System.out.print(sb);
    }

    static int find(int x) {
        if (arr[x] < 0) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }

    static void union(int u, int v) {
        u = find(u);
        v = find(v);
        if (u == v) {
            return;
        }
        arr[v] = u;
    }
}