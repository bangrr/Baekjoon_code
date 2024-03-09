import java.util.*;
import java.io.*;

public class Bj_14641 {
    static ArrayList<Integer>[] edge;
    static boolean[] visited;
    static boolean chk;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        edge = new ArrayList[26];
        for (int i=0; i<26; i++) {
            edge[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = st.nextToken().charAt(0) - 'a';
            int b = st.nextToken().charAt(0) - 'a';
            edge[a].add(b);
        }
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String le = st.nextToken();
            String ri = st.nextToken();
            if (le.length() == ri.length()) {
                int cnt = ri.length();
                for (int i=0; i<ri.length(); i++) {
                    int s = le.charAt(i) - 'a';
                    int e = ri.charAt(i) - 'a';
                    chk = false;
                    visited = new boolean[26];
                    dfs(s, e);
                    if (!chk) {
                        cnt--;
                    }
                }
                if (cnt == ri.length()) {
                    sb.append("yes");
                } else {
                    sb.append("no");
                }
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void dfs(int s, int e) {
        if (s == e) {
            chk = true;
            return;
        }
        visited[s] = true;
        for (int next : edge[s]) {
            if (!visited[next]) {
                dfs(next, e);
            }
        }
    }
}