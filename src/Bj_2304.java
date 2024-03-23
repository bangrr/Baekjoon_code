import java.util.*;
import java.io.*;

public class Bj_2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        int max = 0;
        int idx = 0;
        int sum = 0;
        for (int i=0; i<n; i++) {
            if (arr[i][1] > max) {
                sum += max * (arr[i][0]-idx);
                max = arr[i][1];
                idx = arr[i][0];
            }
        }
        max = 0;
        int idx2 = arr[n-1][0];
        for (int i=n-1; i>=0; i--) {
            if (arr[i][1] > max) {
                sum += max * (idx2-arr[i][0]);
                max = arr[i][1];
                idx2 = arr[i][0];
            }
        }
        sum += max * (idx2-idx+1);
        System.out.print(sum);
    }
}