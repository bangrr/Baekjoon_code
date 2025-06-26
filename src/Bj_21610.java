import java.util.*;
import java.io.*;

public class Bj_21610 {
    static int n, m;
    static int[][] buckets;
    static boolean[][] checked;
    static int[] dr = {0, 0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dc = {0, -1, -1, 0, 1, 1, 1, 0, -1};
    static ArrayList<Cloud> clouds;

    private static class Cloud {
        int y, x;

        public Cloud(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        buckets = new int[n+1][n+1];
        checked = new boolean[n+1][n+1];
        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; j++) {
                buckets[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 비바라기!!!
        clouds = new ArrayList<>();
        clouds.add(new Cloud(n, 1));
        clouds.add(new Cloud(n, 2));
        clouds.add(new Cloud(n-1, 1));
        clouds.add(new Cloud(n-1, 2));

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            // 1. 모든 구름 d방향으로 s칸 이동
            move(d, s);
            // 2. 구름이 있는 칸의 바구니 물의 양이 1 증가
            raining();
            // 3. 구름이 모두 사라진다
            disappear();
            // 4. 각 비내린곳의 대각 4곳을 확인후 물이 있는 칸의 수를 더해서 넣어준다
            copy();
            // 5. 이전 구름이 있던 자리 말고 나머지 중에 물의 양이 2 이상인 곳에 구름생성
            appear();
        }

        System.out.print(sumBuckets());
    }

    private static void move(int d, int s) {
        for (Cloud cl : clouds) {
            int ny = (n * 100 + cl.y + dr[d] * s) % n;
            int nx = (n * 100 + cl.x + dc[d] * s) % n;

            cl.y = ny == 0 ? n : ny;
            cl.x = nx == 0 ? n : nx;
        }
    }

    private static void raining() {
        for (Cloud cl : clouds) {
            buckets[cl.y][cl.x]++;
        }
    }

    private static void disappear() {
        checked = new boolean[n+1][n+1];
        for (Cloud cl : clouds) {
            checked[cl.y][cl.x] = true;
        }
    }

    private static void copy() {
        for (Cloud cl : clouds) {
            int y = cl.y;
            int x = cl.x;
            int cnt = 0;
            for (int i=2; i<=8; i+=2) {
                int ny = y + dr[i];
                int nx = x + dc[i];
                if (ny <= 0 || ny > n || nx <= 0 || nx > n) continue;
                if (buckets[ny][nx] > 0) cnt++;
            }
            buckets[y][x] += cnt;
        }
    }

    private static void appear() {
        clouds = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (checked[i][j] || buckets[i][j] < 2) {
                    checked[i][j] = false;
                    continue;
                }
                clouds.add(new Cloud(i, j));
                buckets[i][j] -= 2;
                checked[i][j] = true;
            }
        }
    }

    private static int sumBuckets() {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                sum += buckets[i][j];
            }
        }
        return sum;
    }
}