import java.util.*;
import java.io.*;

public class Bj_4158 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n + m == 0) return;
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            int cnt = 0;
            for (int i=0; i<m; i++) {
                int b = Integer.parseInt(br.readLine());
                int l = 0;
                int r = n-1;
                while (l <= r) {
                    int p = (l+r)/2;
                    if (a[p] == b) {
                        cnt++;
                        break;
                    } else if (a[p] < b) {
                        l = p+1;
                    } else if (a[p] > b) {
                        r = p-1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}