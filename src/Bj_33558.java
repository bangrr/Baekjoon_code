import java.io.*;
import java.util.*;

public class Bj_33558 {
    static int n, m, u, v;
    static char[][] arr, tex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];

        st = new StringTokenizer(br.readLine());
        u = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        tex = new char[u][v];

        for (int i = 0; i < u; i++) {
            String s = br.readLine();
            for (int j = 0; j < v; j++) {
                tex[i][j] = s.charAt(j);
            }
        }

        String command = br.readLine();
        if (command.equals("clamp-to-edge")) {
            clampToEdge();
        } else if (command.equals("repeat")) {
            repeat();
        } else {
            mirroredRepeat();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    private static void clampToEdge() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = tex[Math.min(i, u - 1)][Math.min(j, v - 1)];
            }
        }
    }

    private static void repeat() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = tex[i % u][j % v];
            }
        }
    }

    private static void mirroredRepeat() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int row = i % (2 * u);
                int col = j % (2 * v);

                if (row >= u) {
                    row = 2 * u - 1 - row;
                }
                if (col >= v) {
                    col = 2 * v - 1 - col;
                }

                arr[i][j] = tex[row][col];
            }
        }
    }
}