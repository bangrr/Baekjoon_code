import java.io.*;
import java.util.*;

public class Bj_1043 {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        Set<Integer> knowList = new HashSet<>();
        if (k == 0) {
            System.out.print(m);
            return;
        } else {
            while (k-- > 0) {
                knowList.add(Integer.parseInt(st.nextToken()));
            }
        }

        ArrayList<Integer>[] partyList = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            partyList[i] = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            boolean isKnow = false;
            for (int j = 0; j < t; j++) {
                int u = Integer.parseInt(st.nextToken());
                partyList[i].add(u);
            }
            for (int j = 1; j < t; j++) {
                union(partyList[i].get(j - 1), partyList[i].get(j));
            }
        }

        int cnt = m;
        for (int j = 0; j < m; j++) {
            for (int it : knowList) {
                if (find(partyList[j].get(0)) == find(it)) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.print(cnt);
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
        if (arr[x] == x) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }
}