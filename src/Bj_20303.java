import java.io.*;
import java.util.*;

public class Bj_20303 {
    static int[] arr;
    static int[] candy;
    static int[] frd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        candy = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            candy[i] = Integer.parseInt(st.nextToken());
        }
        frd = new int[n + 1];
        Arrays.fill(frd, 1);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            union(a, b);
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i] != i) {
                int p = find(i);
                candy[p] += candy[i];
                frd[p] += frd[i];
            }
        }

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (arr[i] == i) {
                list.add(new int[]{candy[i], frd[i]});
            }
        }

        int[][] dp = new int[list.size() + 1][k];
        for (int i = 1; i <= list.size(); i++) {
            int candyCnt = list.get(i - 1)[0];
            int frdCnt = list.get(i - 1)[1];

            for (int j = 0; j < k; j++) {
                if (frdCnt <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - frdCnt] + candyCnt);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.print(dp[list.size()][k - 1]);
    }

    static int find(int x) {
        if (arr[x] == x) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }

    static void union(int u, int v) {
        u = find(u);
        v = find(v);

        arr[Math.max(u, v)] = Math.min(u, v);
    }
}
