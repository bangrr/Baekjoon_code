import java.io.*;
import java.util.*;

public class Bj_35306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][k];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<k; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] ans = new int[n];
        for (int i=0; i<k; i++) {
            int max = -1;
            int idx = -1;
            for (int j=0; j<n; j++) {
                if (max < arr[j][i]) {
                    max = arr[j][i];
                    idx = j;
                } else if (max == arr[j][i]) {
                    idx = -1;
                }
            }
            if (idx > -1) ans[idx]++;
        }

        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (ans[i] > 0) cnt++;
        }
        System.out.print(cnt);
    }
}