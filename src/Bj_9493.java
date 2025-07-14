import java.io.*;
import java.util.*;

public class Bj_9493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken()) * 3600;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (m == 0 && a == 0 && b == 0) {
                break;
            }
            int sub = (int) Math.round((double) m / a - (double) m / b);
            int hour = sub / 3600;
            int min = (sub % 3600) / 60;
            int second = sub % 60;
            sb.append(hour).append(":").append(String.format("%02d", min)).append(":").append(String.format("%02d", second)).append("\n");
        }
        System.out.print(sb);
    }
}