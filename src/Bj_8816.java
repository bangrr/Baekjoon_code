import java.io.*;

public class Bj_8816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int z =  Integer.parseInt(br.readLine());
        while (z-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 1;
            for (int i = 1; i < n; i+=2) {
                ans *= i;
                ans %= 1000;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}