import java.io.*;
import java.util.*;

public class Bj_1275 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // main 메소드
    public static void main(String[] args) throws IOException {
        input();
        System.out.print(sb);
    }

    // 입력부
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }
        int h = (int)Math.ceil(Math.log(n) / Math.log(2));
        long[] tree = new long[1<<(h+1)];
        init(a, tree, 1, 0, n-1);

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int left = Math.min(l, r);
            int right = Math.max(l, r);
            sb.append(query(tree, 1, 0, n-1, left-1, right-1)).append("\n");

            int index = Integer.parseInt(st.nextToken());
            long val = Long.parseLong(st.nextToken());
            update(a, tree, 1, 0, n-1, index-1, val);
        }
    }

    static void init(long[]a, long[] tree, int node, int start, int end) {
        if (start == end) {
            tree[node] = a[start];
        } else {
            init(a, tree, node*2, start, (start+end)/2);
            init(a, tree, node*2+1, (start+end)/2+1, end);
            tree[node] = tree[node*2] + tree[node*2+1];
        }
    }

    static long query(long[] tree, int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 0;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }
        long lsum = query(tree, node*2, start, (start+end)/2, left, right);
        long rsum = query(tree, node*2+1, (start+end)/2+1, end, left, right);
        return lsum+rsum;
    }

    static void update(long[] a, long[] tree, int node, int start, int end, int index, long val) {
        if (index > end || index < start) {
            return;
        }
        if (start == end) {
            a[index] = val;
            tree[node] = val;
            return;
        }
        update(a, tree, node*2, start, (start+end)/2, index, val);
        update(a, tree, node*2+1, (start+end)/2+1, end, index, val);
        tree[node] = tree[node*2] + tree[node*2+1];
    }
}