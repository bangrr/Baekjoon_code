import java.io.*;

public class Bj_5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        sb.append("#");
                    } else {
                        sb.append("J");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}