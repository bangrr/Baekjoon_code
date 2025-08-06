import java.io.*;

public class Bj_2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String empty = br.readLine();
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            for (int i=0; i<n; i++) {
                sum += (Long.parseLong(br.readLine()) % n);
            }
            if (sum % n == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}