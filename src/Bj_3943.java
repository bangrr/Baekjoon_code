import java.io.*;

public class Bj_3943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int max = n;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3*n+1;
                }
                max = Math.max(max, n);
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
    }
}