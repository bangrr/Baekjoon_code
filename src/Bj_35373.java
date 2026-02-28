import java.io.*;
import java.util.*;

public class Bj_35373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int a = Integer.parseInt(st.nextToken());
            if (c == 'S') {
                arr[0] += a;
            } else if (c == 'M') {
                arr[1] += a;
            } else if (c == 'L') {
                arr[2] += a;
            }
        }
        int ans = 0;
        ans += (arr[0] % 6 == 0 ? arr[0] / 6 : arr[0] / 6 + 1);
        ans += (arr[1] % 8 == 0 ? arr[1] / 8 : arr[1] / 8 + 1);
        ans += (arr[2] % 12 == 0 ? arr[2] / 12 : arr[2] / 12 + 1);
        System.out.print(ans);
    }
}