import java.io.*;
import java.util.*;

public class Bj_34749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[j] = Math.max(arr[j], Integer.parseInt(st.nextToken()));
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}