import java.util.*;
import java.io.*;

public class Bj_31575 {
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int[][] boardA = new int[n][m];
        Queue<int[]> qA = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                boardA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        qA.add(new int[]{0, 0});
        System.out.print(bfs(boardA, qA) ? "Yes" : "No");
    }

    private static boolean bfs(int[][] board, Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int r = pos[0];
            int c = pos[1];
            if (r == n-1 && c == m-1) {
                return true;
            }
            for (int i=0; i<2; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= n || nr < 0 || nc >= m || nc < 0) continue;
                if (board[nr][nc] == 1) {
                    q.add(new int[]{nr, nc});
                    board[nr][nc] = 2;
                }
            }
        }
        return false;
    }
}