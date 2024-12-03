import java.io.*;
import java.util.*;

public class Bj_14428 {
    static int[] arr, tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        tree = new int[n*4];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr[0] = 1111111111;
        init(1, n, 1);

        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            if (q == 1) {
                int p = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                update(1, n, 1, p, val);
            } else if (q == 2) {
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());
                sb.append(query(1, n, 1, left, right)).append("\n");
            }
        }
        System.out.print(sb);
    }

    static void init(int s, int e, int c) {
        if (s == e) {
            tree[c] = s;
        } else {
            int mid = (s + e) / 2;
            init(s, mid, c * 2);
            init(mid + 1, e, c * 2 + 1);

            if (arr[tree[c * 2]] <= arr[tree[c * 2 + 1]]) {
                tree[c] = tree[c * 2];
            } else {
                tree[c] = tree[c * 2 + 1];
            }
        }
    }

    static void update(int s, int e, int c, int idx, int val) {
        if (idx < s || idx > e) {
            return;
        }
        if (s == e) {
            tree[c] = idx;
            arr[idx] = val;
            return;
        }
        int mid = (s + e) / 2;
        update(s, mid, c * 2, idx, val);
        update(mid+1, e, c * 2 + 1, idx, val);

        if (arr[tree[c * 2]] <= arr[tree[c * 2 + 1]]) {
            tree[c] = tree[c * 2];
        } else {
            tree[c] = tree[c * 2 + 1];
        }
    }

    static int query(int s, int e, int c, int l, int r) {
        if (l > e || r < s) {
            return 0;
        }
        if (l <= s && e <= r) {
            return tree[c];
        }
        int mid = (s + e) / 2;
        int le = query(s, mid, c*2, l, r);
        int ri = query(mid + 1, e, c*2 + 1, l, r);

        if (arr[le] <= arr[ri]) {
            return le;
        } else {
            return ri;
        }
    }
}
