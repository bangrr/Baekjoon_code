import java.util.*;
import java.io.*;

public class Bj_10026 {
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        char[][] boardA = new char[n][n];
        boolean[][] visitedA = new boolean[n][n];
        Queue<int[]> qA = new LinkedList<>();

        char[][] boardB = new char[n][n];
        boolean[][] visitedB = new boolean[n][n];
        Queue<int[]> qB = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                boardA[i][j] = c;
                boardB[i][j] = c == 'G' ? 'R' : c;
            }
        }

        int ansA = 0, ansB = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visitedA[i][j]) {
                    qA.add(new int[]{i, j});
                    visitedA[i][j] = true;
                    bfs(boardA, visitedA, qA);
                    ansA++;
                }
                if (!visitedB[i][j]) {
                    qB.add(new int[]{i, j});
                    visitedB[i][j] = true;
                    bfs(boardB, visitedB, qB);
                    ansB++;
                }
            }
        }
        System.out.print(ansA + " " + ansB);
    }

    private static void bfs(char[][] board, boolean[][] visited, Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int r = pos[0];
            int c = pos[1];
            for (int i=0; i<4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= n || nr < 0 || nc >= n || nc < 0) continue;
                if (!visited[nr][nc] && board[r][c] == board[nr][nc]) {
                    q.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }
    }
}