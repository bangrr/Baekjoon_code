import java.io.*;

public class Bj_16715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            int t = n;
            while (t > 0) {
                sum += (t % i);
                t /= i;
            }
            if (sum > max) {
                max = sum;
                ans = i;
            }
        }
        System.out.print(max + " " + ans);
    }
}