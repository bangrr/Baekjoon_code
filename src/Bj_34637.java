import java.io.*;
import java.util.*;

public class Bj_34637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[51];
        for (int i = 0; i < n; i++) {
            int d = Integer.parseInt(br.readLine());
            arr[d]++;
        }
        int cnt = 0;
        for (int i = 1; i <= 50; i++) {
            if (arr[i] > 0) {
                cnt++;
            }
        }
        System.out.print(Math.min(cnt, k));
    }
}