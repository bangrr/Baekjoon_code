import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_31924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }


        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
        char[] mobis = "MOBIS".toCharArray();

        int ans = 0;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (arr[y][x] == 'M') {
                    for (int w = 0; w < 8; w++) {
                        int cnt = 1;
                        for (int z = 1; z < 5; z++) {
                            int ny = y + dy[w] * z;
                            int nx = x + dx[w] * z;
                            if (ny < 0 || ny >= n || nx < 0 || nx >= n) continue;
                            if (arr[ny][nx] == mobis[cnt]) {
                                cnt++;
                            }
                            if (cnt == 5) ans++;
                        }
                    }
                }
            }
        }
        System.out.print(ans);
    }
}