import java.io.*;

public class Bj_27251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            int p = i*i;
            if (p > 100) {
                sb.append("*".repeat(100)).append("...");
            } else {
                sb.append("*".repeat(p));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}