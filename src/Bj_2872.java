import java.io.*;

public class Bj_2872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int ans = 0;
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max > arr[i]) {
                ans = Math.max(ans, arr[i]);
            } else {
                max = arr[i];
            }
        }
        System.out.print(ans);
    }
}