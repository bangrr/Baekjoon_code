import java.io.*;
import java.util.*;

public class Bj_4485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};

        int idx = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));

            int[][] min = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(min[i], Integer.MAX_VALUE);
            }
            min[0][0] = arr[0][0];
            pq.add(new int[]{0, 0, min[0][0]});

            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                int cy = cur[1];
                int cx = cur[0];

                if (cx == n - 1 && cy == n - 1) {
                    sb.append(String.format("Problem %d: %d\n", idx++, min[n-1][n-1]));
                    break;
                }
                for (int i = 0; i < 4; i++) {
                    int ny = cy + dy[i];
                    int nx = cx + dx[i];

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                        continue;
                    }

                    int nk = min[cy][cx] + arr[ny][nx];
                    if (nk < min[ny][nx]) {
                        min[ny][nx] = nk;
                        pq.add(new int[]{nx, ny, nk});
                    }
                }
            }
        }
        System.out.print(sb);
    }
}
