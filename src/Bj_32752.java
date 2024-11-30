import java.io.*;
import java.util.*;

public class Bj_32752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[n + 1] = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, l, r+1);

        if (arr[l - 1] <= arr[l] && arr[r] <= arr[r + 1]) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}