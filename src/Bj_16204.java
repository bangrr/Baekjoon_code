import java.io.*;
import java.util.*;

public class Bj_16204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] f = new char[n];
        for (int i = 0; i < n; i++) {
            if (i < m) {
                f[i] = 'O';
            } else {
                f[i] = 'X';
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                if (f[i] == 'O') cnt++;
            } else {
                if (f[i] == 'X') cnt++;
            }
        }

        System.out.print(cnt);
    }
}