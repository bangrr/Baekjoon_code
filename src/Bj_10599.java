import java.io.*;
import java.util.*;

public class Bj_10599 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            sb.append(c-b).append(" ").append(d-a).append("\n");
        }
        System.out.print(sb);
    }
}