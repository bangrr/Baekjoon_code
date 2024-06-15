import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_30658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            for (int i = n-1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
            System.out.println(0);
        }
    }
}