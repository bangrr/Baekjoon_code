import java.io.*;
import java.util.StringTokenizer;

public class Bj_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        for (int i = l; i <= 100; i++) {
            int s = (int)Math.ceil((double)n/i - i/2);

            int sum = 0;
            for (int j=s; j < s+i; j++) {
                sum += j;
                sb.append(j).append(" ");
                if (j < 0) {
                    sum = 0;
                    break;
                }
            }

            if (sum == n) {
                System.out.print(sb);
                return;
            } else {
                sb.setLength(0);
            }
        }
        System.out.print(-1);
    }
}