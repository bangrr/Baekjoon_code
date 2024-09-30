import java.io.*;
import java.util.*;

public class Bj_23882 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(selectionSort(arr, k));
    }

    private static String selectionSort(int[] arr, int k) {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for (int last = arr.length - 1; last > 0; last--) {
            int max = 0;
            int idx = -1;
            for (int i = 0; i <= last; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }
            if (last != idx) {
                cnt++;
                int temp = arr[idx];
                arr[idx] = arr[last];
                arr[last] = temp;
                if (cnt == k) {
                    for (int it : arr) {
                        sb.append(it).append(" ");
                    }
                    break;
                }
            }
        }
        if (cnt < k) {
            System.out.print(-1);
        }

        return sb.toString();
    }
}