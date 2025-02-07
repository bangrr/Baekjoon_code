import java.io.*;
import java.util.*;

public class Bj_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int nc = n;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j] == 'X') {
                    nc--;
                    break;
                }
            }
        }
        int mc = m;
        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {
                if (arr[i][j] == 'X') {
                    mc--;
                    break;
                }
            }
        }
        System.out.print(Math.max(nc, mc));
    }
}
