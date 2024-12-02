import java.io.*;
import java.util.*;

public class Bj_32777 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a < b ? b - a : b + 43 - a;
            int d = a < b ? a + 43 - b : a - b;
            sb.append(c < d ? "Inner circle line" : "Outer circle line").append("\n");
        }
        System.out.print(sb);
    }
}