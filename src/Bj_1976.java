import java.io.*;
import java.util.*;

public class Bj_1976 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        Arrays.fill(arr, -1);

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    union(i, j);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int prevP = find(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < m; i++) {
            int curP = find(Integer.parseInt(st.nextToken()));
            if (prevP != curP) {
                System.out.print("NO");
                return;
            }
            prevP = curP;
        }
        System.out.print("YES");
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