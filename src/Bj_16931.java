import java.io.*;
import java.util.*;

public class Bj_16931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int sum = n * m * 2; // 위에서 볼때랑 아래서 볼때는 미리 더해놨음
        sum += (leftCount(arr, n, m) + rightCount(arr, n, m)) + (frontCount(arr, n, m) + backCount(arr, n, m));
        System.out.print(sum);
    }

    private static int leftCount(int[][] arr, int n, int m) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int prev = 0;
            for (int j = 0; j < m; j++) {
                if (prev < arr[i][j]) {
                    cnt += arr[i][j] - prev;
                }
                prev = arr[i][j];
            }
        }
        return cnt;
    }

    private static int rightCount(int[][] arr, int n, int m) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int prev = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (prev < arr[i][j]) {
                    cnt += arr[i][j] - prev;
                }
                prev = arr[i][j];
            }
        }
        return cnt;
    }

    private static int frontCount(int[][] arr, int n, int m) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int prev = 0;
            for (int j = 0; j < n; j++) {
                if (prev < arr[j][i]) {
                    cnt += arr[j][i] - prev;
                }
                prev = arr[j][i];
            }
        }
        return cnt;
    }

    private static int backCount(int[][] arr, int n, int m) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int prev = 0;
            for (int j = n - 1; j >= 0; j--) {
                if (prev < arr[j][i]) {
                    cnt += arr[j][i] - prev;
                }
                prev = arr[j][i];
            }
        }
        return cnt;
    }
}
