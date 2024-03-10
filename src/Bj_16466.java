import java.util.*;
import java.io.*;

public class Bj_16466 {
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
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (ans == arr[i]) {
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}