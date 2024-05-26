import java.io.*;
import java.util.*;

public class Bj_18436 {
    // 입출력 메소드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int n;
    static long[] tree;

    // main 메소드
    public static void main(String[] args) throws IOException {
        input();
        System.out.print(sb);
    }

    // 입력부
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        tree = new long[n<<1];
        for (int i=0; i<n; i++) {
            tree[i+n] = Long.parseLong(st.nextToken()) % 2;
        }
        init();

        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            if (q == 1) {
                int p = Integer.parseInt(st.nextToken());
                long val = Long.parseLong(st.nextToken());
                update(p, val);
            } else {
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());
                long res = query(left, right);
                sb.append(q==2 ? right+1-left-res : res).append("\n");
            }
        }
    }

    static void init() {
        for (int i=n-1; i>=1; i--) tree[i] = tree[i<<1] + tree[i<<1|1];
    }

    static long query(int left, int right) {
        long res = 0;
        for (left+=n-1, right+=n; left<right; left>>=1, right>>=1) {
            if (left%2>0) res += tree[left++];
            if (right%2>0) res += tree[--right];
        }
        return res;
    }

    static void update(int p, long val) {
        for (tree[p+=n-1] = val % 2; p>1; p>>=1) tree[p>>1] = tree[p] + tree[p^1];
    }
}