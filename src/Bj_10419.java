import java.io.*;

public class Bj_10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i=1; i<111; i++) {
                if (i + i*i > n) {
                    sb.append(i-1).append("\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}