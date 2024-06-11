import java.io.*;
import java.util.*;

public class Bj_3098 {
    static int n, m;
    static ArrayList<Integer>[] adj, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        tmp = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
            tmp[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }

        int day = 0;
        while (checkAllFriend()) {
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                for (int next : adj[i]) {
                    for (int jump : adj[next]) {
                        if (i == jump) continue;
                        if (!adj[i].contains(jump) && !tmp[i].contains(jump)) {
                            tmp[i].add(jump);
                            tmp[jump].add(i);
                            cnt++;
                        }
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int next : tmp[i]) {
                    adj[i].add(next);
                }
            }

            for (int i = 1; i <= n; i++) {
                tmp[i] = new ArrayList<>();
            }
            day++;
            sb.append(cnt).append("\n");
        }
        System.out.println(day);
        System.out.print(sb);
    }

    private static boolean checkAllFriend() {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += adj[i].size();
        }
        return n*(n-1) != sum;
    }
}