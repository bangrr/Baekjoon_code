import java.io.*;
import java.util.*;

public class Bj_1184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];
        int[][] sum = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + arr[i][j];
            }
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                ArrayList<Integer> listA = new ArrayList<>();
                ArrayList<Integer> listB = new ArrayList<>();
                for (int a = i - 1; a > 0; a--) {
                    for (int b = j - 1; b > 0; b--) {
                        listA.add(sum[i-1][j-1] - sum[a - 1][j-1] - sum[i-1][b - 1] + sum[a - 1][b - 1]);
                    }
                }
                for (int a = i; a <= n; a++) {
                    for (int b = j; b <= n; b++) {
                        listB.add(sum[a][b] - sum[i - 1][b] - sum[a][j - 1] + sum[i - 1][j - 1]);
                    }
                }
                for (int ai : listA) {
                    for (int bi : listB) {
                        if (ai == bi) cnt++;
                    }
                }

                listA = new ArrayList<>();
                listB = new ArrayList<>();
                for (int a = i - 1; a > 0; a--) {
                    for (int b = j; b <= n; b++) {
                        listA.add(sum[i - 1][b] - sum[a - 1][b] - sum[i - 1][j - 1] + sum[a - 1][j - 1]);
                    }
                }
                for (int a = i; a <= n; a++) {
                    for (int b = j - 1; b > 0; b--) {
                        listB.add(sum[a][j - 1] - sum[i - 1][j - 1] - sum[a][b - 1] + sum[i - 1][b - 1]);
                    }
                }
                for (int ai : listA) {
                    for (int bi : listB) {
                        if (ai == bi) cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}