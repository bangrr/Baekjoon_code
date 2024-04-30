import java.io.*;
import java.util.*;

public class Bj_23330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long sum = 0;
        long[] sub = new long[n-1];
        for (int i=1; i<n; i++) {
            sub[i-1] = Math.abs(arr[i]-arr[i-1]);
            sum += (sub[i-1] * Math.abs(n-i) * i * 2);
        }
        System.out.print(sum);
    }
}