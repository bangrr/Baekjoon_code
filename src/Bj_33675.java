import java.io.*;

public class Bj_33675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] arr = new long[51];
        arr[0] = 1;
        for (int i=1; i<=50; i++) {
            arr[i] = arr[i-1] * 2;
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                sb.append(arr[n/2]).append("\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}