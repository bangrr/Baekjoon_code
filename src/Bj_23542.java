import java.io.*;
import java.util.*;

public class Bj_23542 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n*2];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n*2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max = 0;
        int min = 400;
        for (int i=0; i<n; i++) {
            int sum = arr[i] + arr[n*2-1-i];
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        System.out.print(max-min);
    }
}