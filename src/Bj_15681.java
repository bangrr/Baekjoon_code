import java.io.*;
import java.util.*;

public class Bj_15681 {
    static List<Integer>[] tree, child;
    static int[] parent, size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        tree = new ArrayList[n + 1];
        child = new ArrayList[n + 1];
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
            child[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            tree[u].add(v);
            tree[v].add(u);
        }

        makeTree(r, -1);
        countSubTreeNodes(r);

        while (q-- > 0) {
            int u = Integer.parseInt(br.readLine());
            sb.append(size[u]).append("\n");
        }
        System.out.print(sb);
    }

    static void makeTree(int curNode, int pNode) {
        for (int node : tree[curNode]) {
            if (node != pNode) {
                child[curNode].add(node);
                parent[node] = curNode;
                makeTree(node, curNode);
            }
        }
    }

    static void countSubTreeNodes(int curNode) {
        size[curNode] = 1;

        for (int node : child[curNode]) {
            countSubTreeNodes(node);
            size[curNode] += size[node];
        }
    }
}
