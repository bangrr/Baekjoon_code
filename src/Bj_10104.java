import java.io.*;

public class Bj_10104 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i < k; i++) {
            int m = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == 0) continue;
                cnt++;

                if (cnt == m) {
                    arr[j] = 0;
                    cnt = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}