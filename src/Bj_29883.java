import java.io.*;
import java.util.*;

public class Bj_29883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + arr[i];
        }

        st = new StringTokenizer(br.readLine());
        while (m-- > 0) {
            int y = Integer.parseInt(st.nextToken());
            if (find(n, sum, y)) sb.append("JAH\n");
            else sb.append("EI\n");
        }
        System.out.print(sb);
    }

    private static boolean find(int n, int[] sum, int y) {
        for (int i=1; i<=n; i++) {
            if (sum[i] < y) continue;
            for (int j=i; j>0; j--) {
                if (sum[i] - sum[j-1] == y) {
                    return true;
                }
            }
        }
        return false;
    }
}