import java.io.*;
import java.util.*;

public class Bj_6186 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }


        int[] DR = {1, 0, -1, 0};
        int[] DC = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '#') {
                    q.add(new int[]{i, j});
                    arr[i][j] = '.';
                    while (!q.isEmpty()) {
                        int[] p = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int nr = p[0] + DR[k];
                            int nc = p[1] + DC[k];
                            if (nr >= 0 && nr < n && nc >= 0 && nc < m && arr[nr][nc] == '#') {
                                q.add(new int[]{nr, nc});
                                arr[nr][nc] = '.';
                            }
                        }
                    }
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}