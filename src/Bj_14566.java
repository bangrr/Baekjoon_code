import java.io.*;
import java.util.*;

public class Bj_14566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < min) {
                    min = diff;
                    cnt = 1;
                } else if (diff == min) {
                    cnt++;
                }
            }
        }
        System.out.print(min + " " + cnt);
    }
}