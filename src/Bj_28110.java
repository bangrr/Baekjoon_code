import java.io.*;
import java.util.*;

public class Bj_28110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] dif = new int[n-1];
        int max = Integer.MIN_VALUE;
        int left = 0;
        for (int i = 0; i < n-1; i++) {
            dif[i] = arr[i+1] - arr[i];
            if (dif[i]/2 > max/2) {
                max = dif[i];
                left = arr[i];
            }
        }
        if (max/2 == 0) {
            System.out.print(-1);
        } else {
            System.out.print(left+max/2);
        }
    }
}
