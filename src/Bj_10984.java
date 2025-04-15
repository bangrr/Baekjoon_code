import java.io.*;
import java.util.*;

public class Bj_10984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            double sum = 0;
            double avg;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                double g = Double.parseDouble(st.nextToken());

                cnt += c;
                sum += g*c;
            }
            avg = sum / cnt;
            sb.append(cnt).append(" ").append(String.format("%.1f", avg)).append("\n");
        }
        System.out.print(sb);
    }
}