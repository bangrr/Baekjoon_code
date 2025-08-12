import java.io.*;
import java.util.*;

public class Bj_34115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[num] == -1) {
                arr[num] = i;
            } else {
                arr[num] = i - arr[num] - 1;
                max = Math.max(max, arr[num]);
            }
        }
        System.out.print(max);
    }
}