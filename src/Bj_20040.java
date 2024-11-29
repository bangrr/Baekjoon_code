import java.io.*;
import java.util.*;

public class Bj_20040 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        Arrays.fill(arr, -1);

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (!union(a, b)) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }

    static int find(int x) {
        if (arr[x] < 0) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }

    static boolean union(int u, int v) {
        u = find(u);
        v = find(v);
        if (u == v) {
            return false;
        }
        arr[u] = v;
        return true;
    }
}