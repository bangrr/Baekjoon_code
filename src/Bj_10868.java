import java.io.*;
import java.util.*;

public class Bj_10868 {
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
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        tree = new long[n<<1];
        for (int i=0; i<n; i++) {
            tree[i+n] = Long.parseLong(br.readLine());
        }
        init();

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            sb.append(query(left, right)).append("\n");
        }
    }

    static void init() {
        for (int i=n-1; i>=1; i--) tree[i] = Math.min(tree[i<<1] , tree[i<<1|1]);
    }

    static long query(int left, int right) {
        long res = 1000000000;
        for (left+=n-1, right+=n; left<right; left>>=1, right>>=1) {
            if (left%2>0) res = Math.min(res, tree[left++]);
            if (right%2>0) res = Math.min(res, tree[--right]);
        }
        return res;
    }
}