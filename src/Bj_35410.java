import java.io.*;
import java.util.*;

public class Bj_35410 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(t);

        int cur = 0;
        for (int i = 0; i < n; i++) {
            if (cur < t[i]) {
                cur = t[i] + 1;
            } else {
                cur = cur + 1;
            }
        }
        System.out.print(cur);
    }
}