import java.io.*;
import java.util.*;

public class Bj_2357 {
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
        int m = Integer.parseInt(st.nextToken());

        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = Long.parseLong(br.readLine());
        }
        int h = (int)Math.ceil(Math.log(n) / Math.log(2));

        long[] minTree = new long[1<<(h+1)];
        long[] maxTree = new long[1<<(h+1)];
        Arrays.fill(minTree, 1000000000);
        Arrays.fill(maxTree, 1);
        initMinTree(a, minTree, 1, 0, n-1);
        initMaxTree(a, maxTree, 1, 0, n-1);

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

			sb.append(findMin(minTree, 1, 0, n-1, left-1, right-1));
            sb.append(" ");
			sb.append(findMax(maxTree, 1, 0, n-1, left-1, right-1));
            sb.append("\n");
        }
    }

    static void initMinTree(long[]a, long[] tree, int node, int start, int end) {
        if (start == end) {
            tree[node] = a[start];
        } else {
            initMinTree(a, tree, node*2, start, (start+end)/2);
            initMinTree(a, tree, node*2+1, (start+end)/2+1, end);
            tree[node] = Math.min(tree[node*2], tree[node*2+1]);
        }
    }

    static void initMaxTree(long[]a, long[] tree, int node, int start, int end) {
        if (start == end) {
            tree[node] = a[start];
        } else {
            initMaxTree(a, tree, node*2, start, (start+end)/2);
            initMaxTree(a, tree, node*2+1, (start+end)/2+1, end);
            tree[node] = Math.max(tree[node*2], tree[node*2+1]);
        }
    }

    static long findMin(long[] tree, int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 1000000000;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }
        long lmin = findMin(tree, node*2, start, (start+end)/2, left, right);
        long rmin = findMin(tree, node*2+1, (start+end)/2+1, end, left, right);
        return Math.min(lmin, rmin);
    }

    static long findMax(long[] tree, int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 1;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }
        long lmax = findMax(tree, node*2, start, (start+end)/2, left, right);
        long rmax = findMax(tree, node*2+1, (start+end)/2+1, end, left, right);
        return Math.max(lmax, rmax);
    }
}