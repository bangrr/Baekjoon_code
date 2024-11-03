import java.io.*;

public class Bj_1947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+5];
        arr[0] = arr[1] = 0;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) * (i-1) % 1000000000;
        }
        System.out.print(arr[n]);
    }
}