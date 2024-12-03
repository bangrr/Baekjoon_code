import java.io.*;
import java.util.*;

public class Bj_16724 {
    static int cnt;
    static char[][] arr;
    static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0) {
                    dfs(i, j);
                }
            }
        }
        System.out.print(cnt);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = 1;

        int ny = i;
        int nx = j;

        if (arr[i][j] == 'D') {
            ny++;
        } else if (arr[i][j] == 'R') {
            nx++;
        } else if (arr[i][j] == 'U') {
            ny--;
        } else if (arr[i][j] == 'L') {
            nx--;
        }

        if (visited[ny][nx] == 0) {
            dfs(ny, nx);
        } else if (visited[ny][nx] == 1) {
            cnt++;
        }
        visited[i][j] = 2;
    }
}
