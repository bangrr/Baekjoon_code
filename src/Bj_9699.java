import java.io.*;
import java.util.*;

public class Bj_9699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j=0; j<5; j++) {
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }
            sb.append("Case #").append(i).append(": ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}