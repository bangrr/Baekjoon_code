import java.io.*;
import java.util.*;

public class Bj_9518 {
    static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        char[][] arr = new char[r + 2][s + 2];
        int sum = 0;
        for (int i = 1; i <= r; i++) {
            String line = br.readLine();
            for (int j = 1; j <= s; j++) {
                arr[i][j] = line.charAt(j - 1);
            }
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= s; j++) {
                if (arr[i][j] == 'o') {
                    sum += check(arr, i, j);
                }
            }
        }
        sum /= 2;

        int max = sum;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= s; j++) {
                if (arr[i][j] == '.') {
                    max = Math.max(max, sum + check(arr, i, j));
                }
            }
        }
        System.out.print(max);
    }

    private static int check(char[][] arr, int r, int c) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            if (arr[r + dr[i]][c + dc[i]] == 'o') {
                cnt++;
            }
        }
        return cnt;
    }
}