import java.io.*;
import java.util.*;

public class Bj_27330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] tar = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int j=0; j<m; j++) {
            tar[j] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
            for (int j=0; j<m; j++) {
                if (sum == tar[j]) {
                    sum = 0;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}