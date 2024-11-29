import java.io.*;
import java.util.*;

public class Bj_7511 {
    static int n, k, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            sb.append(String.format("Scenario %d:\n", i));
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            Arrays.fill(arr, -1);
            k = Integer.parseInt(br.readLine());
            while (k-- > 0) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                union(a, b);
            }
            m = Integer.parseInt(br.readLine());
            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                if (find(u) == find(v)) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    static void union(int u, int v) {
        u = find(u);
        v = find(v);
        if (u == v) {
            return;
        }
        arr[v] = u;
    }

    static int find(int x) {
        if (arr[x] < 0) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }
}